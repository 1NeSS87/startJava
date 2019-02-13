public class Calculator {
	
	private int number1;
	private int number2;
	private char operation;
	private int result;

	public void setNumber1(int number1) {
	this.number1 = number1;
	}

	public void setNumber2(int number2) {
	this.number2 = number2;
	}

	public void setOperation(char operation) {
	this.operation = operation;
	}

	public int getResult() {
		switch(operation) {
			case '+': result = (number1 + number2);
			break;
			case '-': result = (number1 - number2);
			break;
			case '*': result = (number1 * number2);
			break;
			case '/': result = (number1 / number2);
			break;
			case '%': result = (number1 % number2);
			break;
			case '^': 
			int power = 1;
			for(int i = 1; i <= number2; i++) {
				power *= number1;
			}
			result = power;
			break;
			default: System.out.println("Incorrect operation entered");
			break;
		}
		return result;
	}
}