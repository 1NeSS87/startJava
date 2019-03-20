package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Player #1 Enter your name: ");
        Player firstPlayer = new Player(scan.next());

        System.out.println("Player #2 Enter your name: ");
        Player secondPlayer = new Player(scan.next());

        GuessNumber myGame = new GuessNumber(firstPlayer, secondPlayer);
        String answer;

        do {
            myGame.startGame();
            
            do {
                System.out.println("Want to continue? [Yes/No]");
                answer = scan.next();
            } while(!answer.equals("Yes") && !answer.equals("No"));
        } while(answer.equals("Yes"));
    }
}