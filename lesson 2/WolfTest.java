public class WolfTest {
	
	public static void main(String[] args) {
		Wolf forestWolf = new Wolf();

		forestWolf.gender = "man";
		forestWolf.name = "Djon";
		forestWolf.weight = 45.7f;
		forestWolf.age = 10;
		forestWolf.color = "gray";

		System.out.println("Name forestWolf: " + forestWolf.name);
		System.out.println("Gender: " + forestWolf.gender);
		System.out.println("Weight: " + forestWolf.weight);
		System.out.println("Age: " + forestWolf.age);
		System.out.println("Color: " + forestWolf.color);

		forestWolf.go();

		forestWolf.sit();

		forestWolf.run();

		forestWolf.yowl();

		forestWolf.hunt();
	}
}