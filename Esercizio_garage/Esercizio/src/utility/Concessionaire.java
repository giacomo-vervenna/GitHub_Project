package utility;

import garage.Garage;
import veichles.Car;
import veichles.Motorcycle;
import veichles.Van;

public class Concessionaire {

	Garage garage = new Garage();

	public void createCars() {
		
		Car macchina1 = new Car();
		macchina1.setBrand("Volvo");
		macchina1.setAlimentation("diesel");
		macchina1.setConstructionYear(1995);
		macchina1.setDisplacement(500);
		macchina1.setDoor(5);
		garage.insertVeichle(0, macchina1);
		

		Car macchina2 = new Car();
		macchina2.setBrand("Volvo");
		macchina2.setAlimentation("diesel");
		macchina2.setConstructionYear(1995);
		macchina2.setDisplacement(500);
		macchina2.setDoor(5);
		garage.insertVeichle(1, macchina2);

		Car macchina3 = new Car();
		macchina3.setBrand("Volvo");
		macchina3.setAlimentation("diesel");
		macchina3.setConstructionYear(1995);
		macchina3.setDisplacement(500);
		macchina3.setDoor(5);
		garage.insertVeichle(2, macchina3);

		Car macchina4 = new Car();
		macchina4.setBrand("Volvo");
		macchina4.setAlimentation("diesel");
		macchina4.setConstructionYear(1995);
		macchina4.setDisplacement(500);
		macchina4.setDoor(5);
		garage.insertVeichle(3, macchina4);
		
		Car macchina5 = new Car();
		macchina5.setBrand("Volvo");
		macchina5.setAlimentation("diesel");
		macchina5.setConstructionYear(1995);
		macchina5.setDisplacement(500);
		macchina5.setDoor(5);
		garage.insertVeichle(4, macchina5);
	}

	public void createMotorcycles () {
		
		Motorcycle moto1 = new Motorcycle();
		moto1.setBrand("Aprilia");
		moto1.setConstructionYear(2000);
		moto1.setDisplacement(250);
		moto1.setStrokes(4);
		garage.insertVeichle(5, moto1);

		Motorcycle moto2 = new Motorcycle();
		moto2.setBrand("Aprilia");
		moto2.setConstructionYear(2000);
		moto2.setDisplacement(250);
		moto2.setStrokes(4);
		garage.insertVeichle(6, moto2);

		Motorcycle moto3 = new Motorcycle();
		moto3.setBrand("Aprilia");
		moto3.setConstructionYear(2000);
		moto3.setDisplacement(250);
		moto3.setStrokes(4);
		garage.insertVeichle(7, moto3);

		Motorcycle moto4 = new Motorcycle();
		moto4.setBrand("Aprilia");
		moto4.setConstructionYear(2000);
		moto4.setDisplacement(250);
		moto4.setStrokes(4);
		garage.insertVeichle(8, moto4);

		Motorcycle moto5 = new Motorcycle();
		moto5.setBrand("Aprilia");
		moto5.setConstructionYear(2000);
		moto5.setDisplacement(250);
		moto5.setStrokes(4);
		garage.insertVeichle(9, moto5);
	}

	public void createVans() {
		
		Van furgone1 = new Van();
		furgone1.setBrand("Fiat");
		furgone1.setCapacity(400);
		furgone1.setConstructionYear(1987);
		furgone1.setDisplacement(2000);
		garage.insertVeichle(10, furgone1);

		Van furgone2 = new Van();
		furgone2.setBrand("Fiat");
		furgone2.setCapacity(400);
		furgone2.setConstructionYear(1987);
		furgone2.setDisplacement(2000);
		garage.insertVeichle(11, furgone2);

		Van furgone3 = new Van();
		furgone3.setBrand("Fiat");
		furgone3.setCapacity(400);
		furgone3.setConstructionYear(1987);
		furgone3.setDisplacement(2000);
		garage.insertVeichle(12, furgone3);

		Van furgone4 = new Van();
		furgone4.setBrand("Fiat");
		furgone4.setCapacity(400);
		furgone4.setConstructionYear(1987);
		furgone4.setDisplacement(2000);
		garage.insertVeichle(13, furgone4);

		Van furgone5 = new Van();
		furgone5.setBrand("Fiat");
		furgone5.setCapacity(400);
		furgone5.setConstructionYear(1987);
		furgone5.setDisplacement(2000);
		garage.insertVeichle(14, furgone5);
	}
}
