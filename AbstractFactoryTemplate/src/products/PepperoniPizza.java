package products;

import abstractFactory.BaseToppingFactory;

public class PepperoniPizza extends Pizza{

	 BaseToppingFactory toppingFactory;
	 
	    public PepperoniPizza(BaseToppingFactory toppingFactory){
	        
	    	this.toppingFactory = toppingFactory;
	    }
	    
	    @Override
	    public void addIngredients() {
	    
	    	System.out.println("Adding ingredients for pepperoni pizza.");
	        
	    	toppingFactory.createCheese();
	        toppingFactory.createSauce();
	    }
}
