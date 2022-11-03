package products;

import abstractFactory.BaseToppingFactory;

public class CheesePizza extends Pizza{
	
	BaseToppingFactory toppingFactory;
	
	public CheesePizza(BaseToppingFactory toppingFactory) {
		
		this.toppingFactory = toppingFactory;
	}

	@Override
	public void addIngredients() {
		
		System.out.println("Adding ingredients for cheese pizza...");
		
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}
}
