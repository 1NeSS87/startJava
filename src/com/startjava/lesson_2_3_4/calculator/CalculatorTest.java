package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Enter math operation: ");
			String[] mathOperation = scanner.nextLine().split(" ");
			myCalculator.setNumber1(Integer.parseInt(mathOperation[0]));
			myCalculator.setOperation(mathOperation[1].charAt(0));
			myCalculator.setNumber2(Integer.parseInt(mathOperation[2]));
			System.out.println("Total: " + myCalculator.calculate());

			do {
				System.out.println("Want to continue? [Yes/No]");
				answer = scanner.nextLine();
			} while(!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}
}