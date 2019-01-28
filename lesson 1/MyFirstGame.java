public class MyFirstGame {
	
	public static void main(String[] args) {
		int secret = 90;
		int num = 90;

		if (num == secret) {
			System.out.println("You win!");
		} else if (num < secret) {
			System.out.println("The number you entered is less");
		} else {
			System.out.println("The number you entered is greater");
		}
	}
}