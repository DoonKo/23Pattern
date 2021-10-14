package decoratorPattern;

public class MilkDecorator extends CoffeeDecoratorAbstraction {

	public MilkDecorator(ICoffee icoffee) {
		super(icoffee);
	}

	@Override
	public String makeCoffee() {
		return icoffee.makeCoffee() +" with Milk";
	}

}
