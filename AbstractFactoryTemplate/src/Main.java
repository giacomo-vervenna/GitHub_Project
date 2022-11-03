import abstractFactory.BasePizzaFactory;
import abstractFactory.GourmetPizzaFactory;
import abstractFactory.SicilianPizzaFactory;
import products.Pizza;

public class Main {

	public static void main(String[] args) {
		BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");

		BasePizzaFactory pizzaFactory1 = new GourmetPizzaFactory();
		Pizza cheesePizza1 = pizzaFactory.createPizza("cheese");
		Pizza veggiePizza = pizzaFactory.createPizza("veggie");
	}
}

