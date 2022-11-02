package it.aesys.boot.veichles.car;

import it.aesys.boot.veichles.Vehicles;

public class Car extends Vehicles {
	
	protected int doors;
	protected String supply;
	
	public Car(String brand, int year, int displacement, int numberGaragePlace, int doors, String supply) {
		super(brand, year, displacement, numberGaragePlace);
		this.doors = doors;
		this.supply = supply;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}
	
	@Override
	public String toString() {
		return brand + " " + year + " " + displacement + " " + doors + " " + supply + " " + "is at place no." + numberGaragePlace;		
	}

}
