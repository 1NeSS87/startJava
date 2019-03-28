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
    private boolean isWin;
    private int attempt = 0;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        isWin = false;
        compNumber = random.nextInt(100);

        do {
            System.out.println("Попытка: " + (attempt + 1));
            enterNumber(firstPlayer);
            enterNumber(secondPlayer);
            checkNumber(firstPlayer);
            checkNumber(secondPlayer);
            attempt++;
            endedAttempts(firstPlayer);
            endedAttempts(secondPlayer);
        } while (!isWin);

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);

        cleanNumbers(firstPlayer);
        cleanNumbers(secondPlayer);
    }

    public void enterNumber(Player player) {
        System.out.print(player.getName() + " enter your number:");
        player.setNumber(attempt, scan.nextInt());
    }

    public void checkNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + " win");
            System.out.println("Player " + player.getName() + " guess the number " + player.getNumber() + " with " + (attempt+1) + " attempt!");
            isWin = true;
        } else if (player.getNumber() < compNumber) {
            System.out.println(player.getName() + " The number you entered is less");
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + " The number you entered is greater");
        }
    }

    public void endedAttempts(Player player) {
        if (attempt == 10) {
            System.out.println("At " + player.getName() + " ended attempts!");
            isWin = true;
        }
    }

    public void printNumbers(Player player) {
        System.out.println(player.getName());
        for (int i = 0; i < player.getCopyNumbers(attempt).length; i++) {
            System.out.print(player.getCopyNumbers(attempt)[i] + " ");
        }
        System.out.println();
    }

    public void cleanNumbers(Player player) {
            Arrays.fill(player.getNumbers(), 0, (attempt), 0);
    }
}