public class MyFirstGame {
	
	public static void main(String[] args) {
		int comp = 50;
		int user = 77;

		do {
			if (user == comp) {
				System.out.println("You win! " + user);
				break;
			} else if (user < comp) {
				System.out.println(user + " The number you entered is less");
				user++;
			} else {
			System.out.println(user + " The number you entered is greater");
				user--;
			}
		} while (user > 0 & user < 100);
	}
}