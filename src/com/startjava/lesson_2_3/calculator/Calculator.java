package com.startjava.lesson_2_3.calculator;

import static java.lang.Math.*;

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
				return addExact(number1, number2);
			case '-': 
				return subtractExact(number1,number2);
			case '*': 
				return multiplyExact(number1, number2);
			case '/': 
				return number1 / number2;
			case '%': 
				return Math.floorMod(number1, number2);
			case '^':
				return (int) pow(number1, number2);
			default: 
				System.out.println("Incorrect operation entered");
				break;
		}
		return calculation;
	}
}