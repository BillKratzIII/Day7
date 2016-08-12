package zooassignment;

public abstract class Bird extends Animal {
	private boolean canFly = false;
	private boolean canSwim = false;

	public Bird(String name, boolean isAlive, boolean canFly, boolean canSwim) {
		super(name, isAlive);
		this.canFly = canFly;
		this.canSwim = canSwim;
	}

	public String getCanFly() {
		if (canFly) {
			return "can";
		} else {
			return "can't";
		}
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public String getCanSwim() {
		if (canSwim) {
			return "can";
		} else {
			return "can't";
		}
	}

}
