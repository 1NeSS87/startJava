package com.startjava.lesson_2_3_4.game;

import com.sun.istack.internal.NotNull;

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
    private boolean isEnd;
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
            checkNumber(firstPlayer);
            enterNumber(secondPlayer);
            checkNumber(secondPlayer);
            attempt++;
            endedAttempts(firstPlayer);
            endedAttempts(secondPlayer);
        } while (!isWin && !isEnd);

        printNumbers(firstPlayer);
        printNumbers(secondPlayer);

        cleanNumbers(firstPlayer);
        cleanNumbers(secondPlayer);
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + " enter your number:");
        player.setNumber(attempt, scan.nextInt());
    }

    private void checkNumber(Player player) {
        if (player.getNumber() == compNumber) {
            isWin(player);
        } else if (player.getNumber() < compNumber) {
            System.out.println(player.getName() + " The number you entered is less");
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + " The number you entered is greater");
        }
    }

    private void isWin(Player player) {
        System.out.println(player.getName() + " win");
        System.out.println("Player " + player.getName() + " guess the number " + player.getNumber() + " with " + (attempt+1) + " attempt!");
        isWin = true;
    }

    private void endedAttempts(Player player) {
        if (attempt == 10) {
            System.out.println("At " + player.getName() + " ended attempts!");
            isEnd = true;
        }
    }

    private void printNumbers(Player player) {
        System.out.println(player.getName());
        for (int i = 0; i < player.getNumbers(attempt).length; i++) {
            System.out.print(player.getNumbers(attempt)[i] + " ");
        }
        System.out.println();
    }

    private void cleanNumbers(Player player) {
            Arrays.fill(player.getNumbers(attempt), 0, (attempt), 0);
    }
}