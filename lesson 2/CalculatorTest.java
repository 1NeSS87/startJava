import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		Scanner firstNumber = new Scanner(System.in);
		int number1 = firstNumber.nextInt();

		System.out.println("Enter the sign of the mathematical operation: ");
		Scanner inputOperation = new Scanner(System.in);
		char operation = inputOperation.next().charAt(0);

		System.out.println("Enter the second number: ");
		Scanner secondNumber = new Scanner(System.in);
		int number2 = secondNumber.nextInt();

		switch(operation) {
			case '+': System.out.println("Total: " + (number1 + number2));
			break;
			case '-': System.out.println("Total: " + (number1 - number2));
			break;
			case '*': System.out.println("Total: " + (number1 * number2));
			break;
			case '/': System.out.println("Total: " + (number1 / number2));
			break;
			case '%': System.out.println("Total: " + (number1 % number2));
			break;
			case '^': 
			int power = 1;
			for(int i = 1; i <= number2; i++) {
				power *= number1;
			}
			System.out.println("Total: " + power);	
			break;
			default: System.out.println("Incorrect operation entered");
			break;
		}

		System.out.println("Want to continue? [Yes/No]");
		Scanner finish = new Scanner(System.in);
		String answer = finish.nextLine();
		
		if(answer.equals("Yes")) {
			System.out.println("Try again!");
		} else if(answer.equals("No")) {
			System.out.println("GoodBye!");
		} else {
			System.out.println("Want to continue? [Yes/No]");
			finish.nextLine();
		}
	}
}