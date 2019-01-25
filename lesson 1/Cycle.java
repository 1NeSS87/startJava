public class Cycle {
	public static void main (String[] args) {
		int dva = 6;
		int tri = 8;
		for (int i=0; i<=20; i++) {
			System.out.println ("Первый пошел "+i);
		}
		while(dva>-7) {
			System.out.println ("Второй пошел "+dva);
			dva--;
		}
		do {
			tri=tri+2;
			System.out.println ("Третий пошел "+tri);
		} while (tri < 20);
	}
}