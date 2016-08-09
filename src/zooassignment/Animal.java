package zooassignment;

public abstract class Animal {
	private String name = null;
	private boolean isAlive = false;
	
	public Animal(String name, boolean isAlive) {
		this.name = name;
		this.isAlive = isAlive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
}
