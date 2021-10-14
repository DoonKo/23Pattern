package decoratorPattern;

public class TopplingDecorator extends CoffeeDecoratorAbstraction {

	public TopplingDecorator(ICoffee icoffee) {
		super(icoffee);
	}

	@Override
	public String makeCoffee() {
		return icoffee.makeCoffee() +" ,toppling";
	}

}
