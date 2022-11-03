
import veichles.Veichle;
import veichles.Car;
import veichles.Motorcycle;
import veichles.Van;
import garage.Garage;
import utility.Concessionaire;

public class Main {

	public static void main (String[] args) {
		
		Garage garage = new Garage();
		Concessionaire concessionaire = new Concessionaire();
		
		concessionaire.createCars();
		concessionaire.createMotorcycles();
		concessionaire.createVans();
		
		Car macchina1 = new Car();
		macchina1.setBrand("Volvo");
		macchina1.setAlimentation("diesel");
		macchina1.setConstructionYear(1995);
		macchina1.setDisplacement(500);
		macchina1.setDoor(5);
		garage.insertVeichle(0, macchina1);
		//garage.garageStatus();
		
		garage.garageStatus();
		garage.toString(macchina1);
		
	
	}
}
