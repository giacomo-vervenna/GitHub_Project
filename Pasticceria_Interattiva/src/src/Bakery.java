package src;

import java.util.Arrays;
import java.util.Scanner;


public class Bakery {

	static Cake[] expositor = new Cake[5];

	public void greetings() {

		System.out.println("Good morning, we're selling cakes ! :)");
	}

	public void bake() {

		Cake chocolate = new Cake();
		chocolate.setName("Chocolate");
		chocolate.setPrice(10.00);
		expositor[0] = chocolate;

		Cake vanilla = new Cake();
		vanilla.setName("Vanilla");
		vanilla.setPrice(8.00);
		expositor[1] = vanilla;

		Cake cream = new Cake();
		cream.setName("Cream");
		cream.setPrice(5.00);
		expositor[2] = cream;

		Cake berries = new Cake();
		berries.setName("Berries");
		berries.setPrice(12.00);
		expositor[3] = berries;

		Cake rum = new Cake();
		rum.setName("Rum");
		rum.setPrice(15.00);
		expositor[4] = rum;
	}

	public void showCakes() {

		System.out.println("We got this cakes for sale : ");
		for (int index = 0; index < expositor.length; index++) {
			System.out.println(index + " " + expositor[index].getName());
		}
	}

	public void request() {

		System.out.println("What cake would you like to buy ?");
	}

	public void order() {

		Scanner in = new Scanner(System.in);
		int selection = in.nextInt();


		try {
			
			for (int index = 0; index < expositor.length; index++) {

				if (Arrays.stream(expositor).allMatch(c -> c == null)) {

					System.out.println("We sold everything for today, see you tomorrow :D");
					in.close();
					break;
				} else if (index == selection) { 

					int i = 0;

					expositor[i] = expositor[index]; 
					System.out.println("Your cake costs " + expositor[index].getPrice() + " dollars. Enjoy :)");
					expositor[index] = null;
				}
			}
		}catch (NullPointerException npe) {
			System.out.println("Already sold, sorry :(");	
		}
	}
}







