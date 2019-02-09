public class WolfTest {
	
	public static void main(String[] args) {
		Wolf forestWolf = new Wolf();

		forestWolf.setGender("man");
		forestWolf.setName("Djon");
		forestWolf.setWeight(45.7f);
		forestWolf.setAge(11);
		forestWolf.setColor("gray");

		System.out.println("Name forestWolf: " + forestWolf.getName());
		System.out.println("Gender: " + forestWolf.getGender());
		System.out.println("Weight: " + forestWolf.getWeight());
		System.out.println("Age: " + forestWolf.getAge());
		System.out.println("Color: " + forestWolf.getColor());

		forestWolf.go();

		forestWolf.sit();

		forestWolf.run();

		forestWolf.yowl();

		forestWolf.hunt();
	}
}