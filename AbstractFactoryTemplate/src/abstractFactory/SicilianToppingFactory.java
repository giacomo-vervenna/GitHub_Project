package abstractFactory;

import topping.Cheese;
import topping.TomatoSauce;
import topping.MozzarellaCheese;
import topping.Sauce;

public class SicilianToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {

		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {

		return new TomatoSauce();
	}

}
