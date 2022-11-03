package products;

import abstractFactory.BaseToppingFactory;

public class VeggiePizza extends Pizza {

	 BaseToppingFactory toppingFactory;
	 
	    public VeggiePizza(BaseToppingFactory toppingFactory){
	        
	    	this.toppingFactory=toppingFactory;
	    }
	    
	    @Override
	    public void addIngredients() {
	    
	    	System.out.println("Adding ingredients for veggie pizza.");
	    	
	        toppingFactory.createCheese();
	        toppingFactory.createSauce();
	    }
}
