package zooassignment;

public abstract class Anphibian extends Animal{
	private boolean hasMetamorphisized = false;
	private int numLegs;
	
	public Anphibian(String name, boolean isAlive, boolean hasMetamorphisized, int numLegs) {
		super(name, isAlive);
		this.hasMetamorphisized = hasMetamorphisized;
		this.numLegs = numLegs;
	}

	public String getHasMetamorphisized() {
		if (hasMetamorphisized){
			return "has";
		}else{
			return "has not";
		}
	}

	public void setHasMetamorphisized(boolean hasMetamorphisized) {
		this.hasMetamorphisized = hasMetamorphisized;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
	

}
