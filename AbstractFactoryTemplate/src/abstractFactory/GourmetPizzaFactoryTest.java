package abstractFactory;

import products.Pizza;

public class GourmetPizzaFactoryTest {
  
    public void testCreatePizza() throws Exception {
    	
    BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
    
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}