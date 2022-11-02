package it.aesys.boot.veichles.motorbike;

import it.aesys.boot.veichles.Vehicles;
import it.aesys.boot.veichles.van.Van;

public class Motorbike extends Vehicles{
	
	protected int stroke;
	
	public Motorbike(String brand, int year, int displacement, int numberGaragePlace, int stroke) {
		super(brand, year, displacement, numberGaragePlace);
		this.stroke = stroke;
	}

	public int getStroke() {
		return stroke;
	}

	public void setStroke(int stroke) {
		this.stroke = stroke;
	}
	
	@Override
	public String toString() {
		return brand + " " + year + " " + displacement + " " + stroke + " " + "is at place no." + numberGaragePlace;		
	}
}
