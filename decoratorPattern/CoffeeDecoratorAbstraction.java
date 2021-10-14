package decoratorPattern;

public abstract class CoffeeDecoratorAbstraction implements ICoffee {
	
	protected ICoffee icoffee;
	
	
	public CoffeeDecoratorAbstraction(ICoffee icoffee) {
		super();
		this.icoffee = icoffee;
	}

}
