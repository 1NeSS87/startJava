import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		String answer;

		do {
			System.out.println("Enter the first number: ");
			Scanner firstNumber = new Scanner(System.in);
			myCalculator.setNumber1(firstNumber.nextInt());

			System.out.println("Enter the sign of the mathematical operation: ");
			Scanner inputOperation = new Scanner(System.in);
			myCalculator.setOperation(inputOperation.next().charAt(0));

			System.out.println("Enter the second number: ");
			Scanner secondNumber = new Scanner(System.in);
			myCalculator.setNumber2(secondNumber.nextInt());
			System.out.println("Total: " + myCalculator.getResult());

			do {
				System.out.println("Want to continue? [Yes/No]");
				Scanner finish = new Scanner(System.in);
				answer = finish.nextLine();
			} while(!answer.equals("Yes") && !answer.equals("No"));

		} while(answer.equals("Yes"));
	}
}