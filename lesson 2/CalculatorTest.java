import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Enter the first number: ");
			myCalculator.setNumber1(scanner.nextInt());

			System.out.println("Enter the sign of the mathematical operation: ");
			myCalculator.setOperation(scanner.next().charAt(0));

			System.out.println("Enter the second number: ");
			myCalculator.setNumber2(scanner.nextInt());
			System.out.println("Total: " + myCalculator.calculation());

			do {
				System.out.println("Want to continue? [Yes/No]");
				answer = scanner.next();
			} while(!answer.equals("Yes") && !answer.equals("No"));

		} while(answer.equals("Yes"));
	}
}