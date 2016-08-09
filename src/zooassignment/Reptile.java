package zooassignment;

public abstract class Reptile extends Animal {
	private int numLegs = 0;
	private boolean canSwim = false;
	
	public Reptile(String name, boolean isAlive, int numLegs, boolean canSwim) {
		super(name, isAlive);
		this.numLegs = numLegs;
		this.canSwim = canSwim;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}


	public String getCanSwim() {
		if(canSwim){
			return "can";
		}else{
			return "can't";
		}
	}
	
	

}
