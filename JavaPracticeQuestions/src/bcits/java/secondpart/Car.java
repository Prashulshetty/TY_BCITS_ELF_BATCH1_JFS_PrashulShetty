package bcits.java.secondpart;

public class Car {
	String FuelType;
	int InitialFuel;
	public Car(String fuelType, int initialFuel) {
		super();
		FuelType = fuelType;
		InitialFuel = initialFuel;
	}
	@Override
	public String toString() {
		return "Car is initially fuelled with " + InitialFuel + " litre of " + FuelType ;
	}
	

}
