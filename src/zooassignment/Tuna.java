package zooassignment;

public class Tuna extends Fish{
	private String color = null;
	private String type = null;

	public Tuna(String name, boolean isAlive, boolean hasTeeth, boolean isColdBlooded, String color, String type) {
		super(name, isAlive, hasTeeth, isColdBlooded);
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
		return this.getName() + ", a " + this.getColor() + " " + this.getType() + " that " + this.getHasTeeth() + " have teeth & " + this.getIsColdBlooded() + " cold blooded.";
	}

}
