package zooassignment;

public class Kangaroo extends Mammal {
	private String color = null;
	private String type = null;

	public Kangaroo(String name, boolean isAlive, String sex, int numLegs, String color, String type) {
		super(name, isAlive, sex, numLegs);
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.getName() + ", a " + this.getSex() + " " + this.getColor() + " " + this.getType() + " with "
				+ this.getNumLegs() + " legs.";
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + " eats grass.");

	}
}
