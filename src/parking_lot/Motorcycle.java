package parking_lot;

public class Motorcycle extends Vehicle{
	private boolean sidecar = false;
	
	public Motorcycle(boolean running, String color, String condition, boolean fueledUp, int numSeats, int numWheels,
			boolean sidecar) {
		super(running, color, condition, fueledUp, numSeats, numWheels);
		this.sidecar = sidecar;
	}



	public void addSideCar(){
		System.out.println("Adding sidecar...");
		sidecar = true;
		numWheels = 3;
		numSeats++;
	}
	
	

}
