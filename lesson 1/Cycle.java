public class Cycle {
	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			System.out.println ("Первый пошел " + i);
		}

		int second = 6;

		while(second > -7) {
			System.out.println ("Второй пошел " + second);
			second = second - 2;
		}

		int third = 9;
		int sum = 0;

		do {
			third++;
			if (third % 2 != 0) {
				sum = sum + third;
			}
		} while (third < 20 );
		System.out.println ("Третий пошел " + sum);
	}
}