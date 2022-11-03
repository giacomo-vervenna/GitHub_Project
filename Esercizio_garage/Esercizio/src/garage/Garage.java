package garage;

import veichles.Veichle;
import veichles.Car;
import veichles.Van;
import veichles.Motorcycle;

public class Garage implements Util {

	private static Garage single_instance = null;

	public static Garage getInstance() {

		if (single_instance == null) {
			single_instance = new Garage();
		}
		return single_instance;
	}


	Veichle[] garage = new Veichle[15];

	public void insertVeichle(int index, Veichle v) {

		garage[index] = v;
	}

	public String extractVeichle(int index) {

		return garage[index].toString();
	}

	public void garageStatus() {

		for(int index = 0; index < garage.length; index++) {

			System.out.println(garage[index].toString());
		}
	}
	@Override
	public String toString(Veichle v){

		System.out.println(v.getBrand());
		System.out.println(v.getConstructionYear());
		System.out.println(v.getDisplacement());
		System.out.println(((Car) v).getDoor());
		System.out.println(((Car) v).getAlimentation());
		System.out.println(((Motorcycle) v).getStrokes());
		System.out.println(((Van) v).getCapacity());
	}
}


