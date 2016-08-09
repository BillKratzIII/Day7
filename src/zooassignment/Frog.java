package zooassignment;

public class Frog extends Anphibian{
	private String color = null;
	private String type = null;
	
	public Frog(String name, boolean isAlive, boolean hasMetamorphisized, int numLegs, String color, String type) {
		super(name, isAlive, hasMetamorphisized, numLegs);
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
		return this.getName() + ", a " + this.getColor() + " " + this.getType() + " with " + this.getNumLegs() + " legs that " + this.getHasMetamorphisized() + " metamorphasized.";
	}

}
