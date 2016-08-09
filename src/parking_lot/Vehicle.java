package parking_lot;

public class Vehicle {
	protected boolean running = false;
	protected String color = null;
	protected String condition = null;
	protected boolean fueledUp = false;
	protected int numSeats = 0;
	protected int numWheels = 0;
	
	
	
	public Vehicle(boolean running, String color, String condition, boolean fueledUp, int numSeats, int numWheels) {
		super();
		this.running = running;
		this.color = color;
		this.condition = condition;
		this.fueledUp = fueledUp;
		this.numSeats = numSeats;
		this.numWheels = numWheels;
	}



	protected void turnOn(){
		running = true;
	}
	
	public int getNumWheels(){
		return numWheels;
	}

}
