class Wolf {
	
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private float weight;

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= 8) {
			this.age = age;
		} else {
			System.out.println("Incorrect age");
		}
	}

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {

	}

	public void sit() {

	}

	public void run() {

	}

	public void yowl() {

	}

	public void hunt() {

	}
}