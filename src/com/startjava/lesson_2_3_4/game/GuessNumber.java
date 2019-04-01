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
        compNumber = random.nextInt(101);

        do {
            System.out.println("Попытка: " + (attempt + 1));
            enterNumber(firstPlayer);
            checkNumber(firstPlayer);
            if (firstPlayer.getIsWin()) {
                break;
            }
            enterNumber(secondPlayer);
            checkNumber(secondPlayer);
            if (secondPlayer.getIsWin()) {
                break;
            }
            attempt++;

        } while (attempt != 10);

        printResultGame();

        cleanNumbers(firstPlayer);
        cleanNumbers(secondPlayer);
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + " enter your number:");
        player.setNumber(attempt, scan.nextInt());
    }

    private void checkNumber(Player player) {
        if (player.getNumber() == compNumber) {
            reportVictory(player);
            player.setIsWin(true);
        } else if (player.getNumber() < compNumber) {
            System.out.println(player.getName() + " The number you entered is less");
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + " The number you entered is greater");
        }
        if (attempt == 9 && !player.getIsWin()) {
            reportTheEndOfAttempts(player);
        }
    }

    private void reportVictory(Player player) {
        System.out.println(player.getName() + " win");
        System.out.println("Player " + player.getName() + " guess the number " + player.getNumber() + " with " + (attempt + 1) + " attempt!");
    }

    private void reportTheEndOfAttempts(Player player) {
        System.out.println("Dear " + player.getName() + ", your attempts have ended!");
    }

    private void printNumbers(Player player, int attempt) {
        System.out.print("\n" + player.getName() + ": ");
        int[] printAttempts = player.getNumbers(attempt);
        System.out.print(Arrays.toString(printAttempts));
    }

    private void printResultGame() {
        if (firstPlayer.getIsWin()) {
            printNumbers(firstPlayer, attempt + 1);
            printNumbers(secondPlayer, attempt);
        } else if(secondPlayer.getIsWin()) {
            printNumbers(firstPlayer, attempt + 1);
            printNumbers(secondPlayer, attempt + 1);
        }else {
            printNumbers(firstPlayer, (attempt));
            printNumbers(secondPlayer, (attempt));
        }
    }

    private void cleanNumbers (Player player){
            Arrays.fill(player.getNumbers(attempt), 0, (attempt), 0);
            player.setIsWin(false);
    }
}
