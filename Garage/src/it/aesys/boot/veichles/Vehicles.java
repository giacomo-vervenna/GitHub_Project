package it.aesys.boot.veichles;

public abstract class Vehicles {

	protected String brand;
	protected int year;
	protected double displacement;
	protected int numberGaragePlace;
	
	public Vehicles(String brand, int year, int displacement, int numberGaragePlace) {
		this.brand = brand;
		this.year = year;
		this.displacement = displacement;
		this.numberGaragePlace = numberGaragePlace;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getDisplacement() {
		return displacement;
	}
	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	public int getNumberGaragePlace() {
		return numberGaragePlace;
	}

	public void setNumberGaragePlace(int numberGaragePlace) {
		this.numberGaragePlace = numberGaragePlace;
	}
}
