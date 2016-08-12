package zooassignment;

public class Eagle extends Bird {
	private String color = null;
	private String type = null;

	public Eagle(String name, boolean isAlive, boolean canFly, boolean canSwim, String color, String type) {
		super(name, isAlive, canFly, canSwim);
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
		return this.getName() + ", a " + this.getColor() + " " + this.getType() + " that " + this.getCanFly()
				+ " fly & " + this.getCanSwim() + " swim.";
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + " eats fish.");

	}

}
