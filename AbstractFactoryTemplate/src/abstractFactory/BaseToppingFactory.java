package abstractFactory;

import topping.Cheese;
import topping.Sauce;

public abstract class BaseToppingFactory {
	
	 public abstract Cheese createCheese();
	    public abstract Sauce createSauce();
}
