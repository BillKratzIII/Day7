package zooassignment;

public abstract class Fish extends Animal{
	private boolean hasTeeth = false;
	private boolean isColdBlooded = false;
	
	public Fish(String name, boolean isAlive, boolean hasTeeth, boolean isColdBlooded) {
		super(name, isAlive);
		this.hasTeeth = hasTeeth;
		this.isColdBlooded = isColdBlooded;
	}

	public String getHasTeeth() {
		if(hasTeeth){
			return "does";
		}else{
			return "does not";
		}
	}

	public void setHasTeeth(boolean hasTeeth) {
		this.hasTeeth = hasTeeth;
	}

	public String getIsColdBlooded() {
		if (isColdBlooded){
			return "is";
		}else{
			return "is not";
		}
			
	}

	public void setColdBlooded(boolean isColdBlooded) {
		this.isColdBlooded = isColdBlooded;
	}
	
	
	
}
