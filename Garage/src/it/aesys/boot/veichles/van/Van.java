package it.aesys.boot.veichles.van;

import it.aesys.boot.veichles.Vehicles;

public class Van extends Vehicles  {
	
	protected double capacity;
	
	public Van(String brand, int year, int displacement, int numberGaragePlace, double capacity) {
		super(brand, year, displacement, numberGaragePlace);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return brand + " " + year + " " + displacement + " " + capacity + " " + "is at place no." + numberGaragePlace;		
	}
}
