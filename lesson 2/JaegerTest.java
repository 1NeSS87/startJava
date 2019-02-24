public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.41f, 3, 10, 10);

		chernoAlpha.drift();

		chernoAlpha.move();

		chernoAlpha.scanKaiju();

		chernoAlpha.useVortexCannon();

		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.20f, 1.85f, 10, 10, 9);

		strikerEureka.drift();

		strikerEureka.move();

		strikerEureka.scanKaiju();

		strikerEureka.useVortexCannon();

		System.out.println("Name: " + chernoAlpha.getModelName() + "\n" + chernoAlpha.getSpeed() + "\n" + chernoAlpha.getStrength() + "\n" + chernoAlpha.getArmor());
		System.out.println("Name: " + strikerEureka.getModelName() + "\n" + strikerEureka.getSpeed() + "\n" + strikerEureka.getStrength() + "\n" + strikerEureka.getArmor());
		System.out.println(chernoAlpha.getModelName() + " made in " + chernoAlpha.getOrigin() + "\n" + strikerEureka.getModelName() + " made in " + strikerEureka.getOrigin());
		System.out.println(chernoAlpha.getModelName() + " - " + chernoAlpha.drift() + "\n" + strikerEureka.getModelName() + " - " + strikerEureka.drift());
	}
}