public class MyFirstGame {
	
	public static void main(String[] args) {
		int compNumber = 50;
		int userNumber = 20;

		while(userNumber != compNumber) {
			if(userNumber < compNumber) {
				System.out.println(userNumber + " The number you entered is less");
				userNumber++;
			} if(userNumber > compNumber) {
			System.out.println(userNumber + " The number you entered is greater");
				userNumber--;
			}
		} 

		System.out.println("You win! " + userNumber);
	}
}