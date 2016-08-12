package zooassignment;

public abstract class Mammal extends Animal {
	private String sex = null;
	private int numLegs = 0;

	public Mammal(String name, boolean isAlive, String sex, int numLegs) {
		super(name, isAlive);
		this.sex = sex;
		this.numLegs = numLegs;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

}
