public class MyFirstGame2 {
	
	public static void main(String[] args) {
		int secret = 50;
		int i = 0;

		do {
			i++;
			if (i == secret) {
				System.out.println("You win! " + i);
			} else if (i < secret) {
				System.out.println(i + " The number you entered is less");
			} else {
			System.out.println(i + " The number you entered is greater");
			}
		} while (i < 100);
	}
}