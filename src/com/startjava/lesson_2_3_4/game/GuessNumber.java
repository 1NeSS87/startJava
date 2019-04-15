package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    private Player firstPlayer;
    private Player secondPlayer;
    private int compNumber;
    private int attempt = 0;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        compNumber = random.nextInt(100);

        while(attempt != 10) {
            System.out.println("Попытка: " + (attempt + 1));

            if (playGame(firstPlayer)) {
                break;
            }

            if (playGame(secondPlayer)) {
                break;
            }
            attempt++;
        }

        printResultGame(firstPlayer);
        printResultGame(secondPlayer);

        setUp(firstPlayer);
        setUp(secondPlayer);
    }

    private boolean playGame(Player player) {
        enterNumber(player);
        checkNumber(player);
        return player.getIsWin();
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + " enter your number:");
        player.setNumber(attempt, scan.nextInt());
    }

    private void checkNumber(Player player) {
        if(player.getNumber() == compNumber) {
            showAttemptWinner(player);
            player.setIsWin(true);
        } else if(player.getNumber() < compNumber) {
            System.out.println(player.getName() + " The number you entered is less");
        } else if(player.getNumber() > compNumber) {
            System.out.println(player.getName() + " The number you entered is greater");
        }
        if(attempt == 9 && !player.getIsWin()) {
            System.out.println("Dear " + player.getName() + ", your attempts have ended!");
        }
    }

    private void showAttemptWinner(Player player) {
        System.out.println(player.getName() + " win");
        System.out.println("Player " + player.getName() + " guess the number " + player.getNumber() + " with " + (attempt + 1) + " attempt!");
    }

   private void printResultGame(Player player) {
        if(!player.getIsWin()) {
            printNumbers(player, attempt);
        } else {
            printNumbers(player, attempt + 1);
        }
    }

    private void printNumbers(Player player, int attempt) {
        System.out.print("\n" + player.getName() + ": ");
        int[] playerAttempts = player.getNumbers(attempt);
        System.out.print(Arrays.toString(playerAttempts));
    }

    private void setUp(Player player){
            Arrays.fill(player.getNumbers(attempt), 0, attempt, 0);
            player.setIsWin(false);
    }
}
