public class Calculator {
	
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 2;
		char operation = '^';
		
		if (operation == '+') {
			System.out.println("Total: " + (number1 + number2));
		} else if (operation == '-') {
			System.out.println("Total: " + (number1 - number2));
		} else if (operation == '*') {
			System.out.println("Total: " + (number1 * number2));
		} else if (operation == '/') {
			System.out.println("Total: " + (number1 / number2));
		} else if (operation == '^') {
			int power = 1;

			for (int i = 1; i <= number2; i++) {
				power *= number1;
			} 
			System.out.println("Total: " + power);
		} else if (operation == '%') {
			System.out.println("Total: " + (number1 % number2));
		} else {
			System.out.println("Error, incorrect operation value");
		}
	}
}