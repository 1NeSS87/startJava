package com.startjava.lesson_2_3.calculator;

public class Calculator {
	
	private int number1;
	private int number2;
	private char operation;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	int calculation;

	public int calculate() {
		switch(operation) {
			case '+': 
				return Math.addExact(number1, number2);
			case '-': 
				return Math.subtractExact(number1,number2);
			case '*': 
				return Math.multiplyExact(number1, number2);
			case '/': 
				return number1 / number2;
			case '%': 
				return Math.floorMod(number1, number2);
			case '^':
				int power = 1;
				for(int i = 1; i <= number2; i++) {
					power *= number1;
				}
				return power;
			default: 
				System.out.println("Incorrect operation entered");
				break;
		}
		return calculation;
	}
}