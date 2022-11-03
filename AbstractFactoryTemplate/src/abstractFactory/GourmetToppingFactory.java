package abstractFactory;

import topping.Sauce;
import topping.Cheese;
import topping.GoatCheese;
import topping.CaliforniaOilSauce;

public class GourmetToppingFactory extends BaseToppingFactory{

	@Override
	public Cheese createCheese() {
		
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		
		return new CaliforniaOilSauce();
	}

}
