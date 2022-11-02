package it.aesys.boot.garageService.garage;

import java.util.InputMismatchException;
import java.util.Scanner;

import it.aesys.boot.veichles.Vehicles;
import it.aesys.boot.veichles.car.Car;
import it.aesys.boot.veichles.motorbike.Motorbike;
import it.aesys.boot.veichles.van.Van;

public class Garage{

	private Vehicles [] vehicles;

	public Garage (int maxNumVehicles) {
		vehicles = new Vehicles [maxNumVehicles];
	}

	public void createVehicles() {

		Vehicles van1 = new Van("Ducato", 2006, 150, 3, 1500);
		insertVehicles(van1);

		Vehicles van2 = new Van("Fiorino", 2004, 100, 6, 610);
		insertVehicles(van2);

		Vehicles van3 = new Van("Doblò", 2006, 110, 9, 820);
		insertVehicles(van3);

		Vehicles motorbike1 = new Motorbike("Ducati", 2019, 955, 4, 2);
		insertVehicles(motorbike1);

		Vehicles motorbike2 = new Motorbike("Yamaha", 2017, 500, 7, 2);
		insertVehicles(motorbike2);

		Vehicles motorbike3 = new Motorbike("Kawasaki", 2021, 650, 10, 4);
		insertVehicles(motorbike3);

		Vehicles car1 = new Car("Opel", 2018, 100, 13, 4, "Disel");
		insertVehicles(car1);

		Vehicles car2 = new Car("Ferrari", 2022, 400, 1, 2, "Benzina");
		insertVehicles(car2);

		Vehicles car3 = new Car("Panda", 2012, 75, 8, 4, "Benzina");
		insertVehicles(car3);
	}

	public void insertVehicles(Vehicles vehicle) {
		int numberPlaceGarage = vehicle.getNumberGaragePlace();
		if (vehicles [numberPlaceGarage - 1] == null) {
			vehicles [numberPlaceGarage - 1] = vehicle;
		}
	}

	public boolean isEmpty() {
		return count() == vehicles.length;
	}

	public int count() {
		int counter = 0;
		for(Vehicles vehicle : vehicles) {
			if(vehicle == null) {
				counter++;
			}
		}
		return counter;
	}

	public void stampGarageSituation() {

		if (isEmpty() == true) {
			System.out.println("The garage is empty!");
		}
		else {
			System.out.println("Garage situation is the following:");
			for (Vehicles vehicles : vehicles) {
				if(vehicles != null) {
					System.out.println(vehicles);
					continue;
				}
				else if (vehicles == null) {
					continue;
				}
			}
		}
	}

	public void remove(int vehiclesPosition) {
		if(vehicles[vehiclesPosition] != null) {
			vehicles[vehiclesPosition] = null;
			System.out.println("The choosen vehicle have been eliminated");
		} else if (vehicles[vehiclesPosition] == null) {
			System.out.println("The selected place is not available or is empty");
		}
	}

	public void removeVehicles() {
		System.out.println("Select the number of the place you want to eliminate:");
		try{
			Scanner input = new Scanner(System.in);
			int vehiclesPosition = input.nextInt();
			if (vehiclesPosition <=  0 || vehiclesPosition > 15) {
				System.out.println("Insert a valid number");
			}
			else {
				remove(vehiclesPosition -1);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please insert a number: ");
		}
	}

	public void operationChoice() {
		for(;;) {
			System.out.println("Please select no.1 to remove a vehicle or no.2 to check the garage situation.");
			Scanner input = new Scanner(System.in);
			String decision = input.nextLine();
			if (decision.equalsIgnoreCase("1")) {
				if (isEmpty() == true) {
					System.out.println("The garage is empty!");
					break;
				}else {
					removeVehicles();
				}
				continue;
			} else if (decision.equalsIgnoreCase("2")) {
				stampGarageSituation();
				continue;
			}else {
				continue;
			}		
		}
	}	
}
