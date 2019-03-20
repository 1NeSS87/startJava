package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Enter math operation: ");
			String[] array = scanner.nextLine().split(" ");
			myCalculator.setNumber1(Integer.parseInt(array[0]));
			myCalculator.setOperation(array[1].charAt(0));
			myCalculator.setNumber2(Integer.parseInt(array[2]));
			System.out.println("Total: " + myCalculator.calculate());

			do {
				System.out.println("Want to continue? [Yes/No]");
				answer = scanner.nextLine();
			} while(!answer.equals("Yes") && !answer.equals("No"));

		} while(answer.equals("Yes"));
	}
}