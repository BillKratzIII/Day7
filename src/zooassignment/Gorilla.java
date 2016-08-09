package zooassignment;

public class Gorilla extends Mammal{
	private String color = null;
	private String type = null;
	
	public Gorilla(String name, boolean isAlive, String sex, int numLegs, String color, String type) {
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
		return this.getName() + ", a " + this.getSex()+ " " + this.getColor() + " " + this.getType() + " with " + this.getNumLegs() + " legs.";
	}
}
