package CarRental.demo;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{
	
	private int numberOfSeats;
	
	public Car() {
		super();
        this.numberOfSeats = 4;
	}
	
	public Car(int numberOfSeats) {
		super();
		this.numberOfSeats = numberOfSeats;
	}

    public Car(String plate, int numberOfSeats) {
		super(plate);
		this.numberOfSeats = numberOfSeats;
	}

    public Car(String plate) {
		super(plate);
		this.numberOfSeats = 4;
	}

	public int getnumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Car{" +
				"plateNumber='" + this.getPlateNumber() + '\'' +
				", numberOfSeats=" + numberOfSeats +
				'}';
	}
}