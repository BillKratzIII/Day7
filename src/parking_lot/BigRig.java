package parking_lot;

public class BigRig extends Vehicle{
	private boolean hasTrailer = true;
	
	public BigRig(boolean running, String color, String condition, boolean fueledUp, int numSeats, int numWheels,
			boolean hasTrailer) {
		super(running, color, condition, fueledUp, numSeats, numWheels);
		this.hasTrailer = hasTrailer;
	}

	public void withoutATrailer(){
		System.out.println("Removing Trailer....");
		hasTrailer = false;
		numWheels = 10;
	}
		
}
