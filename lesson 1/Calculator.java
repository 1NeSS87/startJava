public class Calculator {
	
	public static void main(String[] args) {
		int number1 = 4;
		int number2 = 10;
		char operation = '^';
		int sum;
		int power = 1;
		
		if (operation == '+') {
			sum = number1 + number2;
			System.out.println("Total: " + sum);
		} else if (operation == '-') {
			sum = number1 - number2;
			System.out.println("Total: " + sum);
		} else if (operation == '*') {
			sum = number1 * number2;
			System.out.println("Total: " + sum);
		} else if (operation == '/') {
			sum = number1 / number2;
			System.out.println("Total: " + sum);
		} else if (operation == '^') {
			for (int i = 1; i <= number2; i++) {
				power *= number1;
				System.out.println("Total: " + power);
			}
		} else if (operation == '%') {
			sum = number1 % number2;
			System.out.println("Total: " + sum);
		} else {
			System.out.println("Error, incorrect operation value");
		}
    }
}
