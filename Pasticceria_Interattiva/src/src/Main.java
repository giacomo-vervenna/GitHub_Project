package src;

import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {

		Bakery whiteBakery = new Bakery();

		whiteBakery.greetings();
		whiteBakery.bake();
		whiteBakery.showCakes();
		whiteBakery.request();

		for(;;) {

			try {	
				whiteBakery.order();
			} catch (NoSuchElementException nsee) {

				break;
			}
		}
	}
}
