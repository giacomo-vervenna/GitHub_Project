package abstractFactory;

import products.Pizza;

public abstract class BasePizzaFactory {
	
	public abstract Pizza createPizza(String type);
}
