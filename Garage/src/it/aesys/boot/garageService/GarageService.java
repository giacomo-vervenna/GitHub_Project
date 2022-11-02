package it.aesys.boot.garageService;

import it.aesys.boot.garageService.garage.Garage;

public class GarageService {
	
	private static Garage garage = new Garage(15);
	
	public static void main(String [] args) {
		
	garage.createVehicles();
	garage.stampGarageSituation();
	garage.operationChoice();
	
	}
}