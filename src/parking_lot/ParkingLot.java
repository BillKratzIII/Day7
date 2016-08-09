package parking_lot;

public class ParkingLot {

	public static void main(String[] args) {
		BigRig megatron = new BigRig(true, "grey", "battle-hardened", true, 3, 18, true);
		System.out.println(megatron.getNumWheels());
		megatron.withoutATrailer();
		System.out.println(megatron.getNumWheels());
		
		System.out.println();
		Motorcycle rocket = new Motorcycle(true, "Red", "New", true, 1, 2, false);
		System.out.println(rocket.getNumWheels());
		rocket.addSideCar();
		System.out.println(rocket.getNumWheels());

	}

}
