public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		if(origin.equals("Russia")) {
			origin = "China";
		} else {
			origin = "India";
		}
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public String drift() {
		if(speed > 5) {
			return "superdrift";
		} else {
			return "slowdrift";
		}
	
	}

	public void move() {

	}

	public void scanKaiju() {

	}

	public void useVortexCannon() {

	}
}