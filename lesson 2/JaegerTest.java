public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger();

		chernoAlpha.setModelName("Cherno Alpha");
		chernoAlpha.setMark("Mark-1");
		chernoAlpha.setOrigin("Russia");
		chernoAlpha.setHeight(85.34f);
		chernoAlpha.setWeight(2.41f);
		chernoAlpha.setSpeed(3);
		chernoAlpha.setStrength(10);
		chernoAlpha.setArmor(10);

		chernoAlpha.drift();

		chernoAlpha.move();

		chernoAlpha.scanKaiju();

		chernoAlpha.useVortexCannon();

		Jaeger strikerEureka = new Jaeger();

		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("Mark-5");
		strikerEureka.setOrigin("Australia");
		strikerEureka.setHeight(76.20f);
		strikerEureka.setWeight(1.85f);
		strikerEureka.setSpeed(10);
		strikerEureka.setStrength(10);
		strikerEureka.setArmor(9);

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