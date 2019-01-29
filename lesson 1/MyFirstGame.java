public class MyFirstGame {
	
	public static void main(String[] args) {
		int compNumber = 50;
		int userNumber = 20;

		do {
			if (userNumber < compNumber) {
				System.out.println(userNumber + " The number you entered is less");
				userNumber++;
			} else if (userNumber > compNumber) {
			System.out.println(userNumber + " The number you entered is greater");
				userNumber--;
			}
		} while (userNumber != compNumber);
		System.out.println("You win! " + userNumber);
	}
}