package zooassignment;

public class Lizard extends Reptile{
	private String color = null;
	private String type = null;
	
	public Lizard(String name, boolean isAlive, int numLegs, boolean canSwim, String color, String type) {
		super(name, isAlive, numLegs, canSwim);
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
	
	public String toString() {
		return this.getName() + ", a " + this.getColor() + " " + this.getType() + " with " + this.getNumLegs() + " legs that " + this.getCanSwim() + " swim.";
	}

}
