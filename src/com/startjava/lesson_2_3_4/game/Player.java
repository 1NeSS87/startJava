package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int attempt, int number) {
        this.number = number;
        numbers[attempt] = number;
    }

    public int[] getNumbers(int attempt) {
        return Arrays.copyOf(numbers, attempt);
    }
}