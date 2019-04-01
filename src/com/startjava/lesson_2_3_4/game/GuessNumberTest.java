package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! You have 10 attempts. Good luck");
        System.out.println("Player #1 Enter your name: ");
        Player firstPlayer = new Player(scan.next());
        System.out.println("Player #2 Enter your name: ");
        Player secondPlayer = new Player(scan.next());

        String answer;

        do {
            GuessNumber myGame = new GuessNumber(firstPlayer, secondPlayer);
            myGame.startGame();
            
            do {
                System.out.println("\n" + "Want to continue? [Yes/No]");
                answer = scan.next();
            } while(!answer.equals("Yes") && !answer.equals("No"));
        } while(answer.equals("Yes"));
    }
}