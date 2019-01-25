public class ConditionalStatement {
	public static void main (String[] args) {
		int age = 21;
		char gender = 'M';
		double height = 1.80;
		char name = 'N';
		if (age>20) {
			System.out.println("you cTap");
		}
		if (gender == 'M') {
			System.out.println("you man");
		}
		if (gender == 'W') {
			System.out.println("you woman");
		}
		if (height < 1.80) {
			System.out.println("you small");
		}
		else {
			System.out.println("you high");
		}
		if (name == 'M') {
			System.out.println("you Marusya");
		}
		else if (name == 'I') {
			System.out.println("you IgoRRR");
		}
		else {
			System.out.println("you Abubakar");
		}
	}
}