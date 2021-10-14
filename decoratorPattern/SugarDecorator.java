package decoratorPattern;

public class SugarDecorator extends CoffeeDecoratorAbstraction {

	public SugarDecorator(ICoffee icoffee) {
		super(icoffee);
	}

	@Override
	public String makeCoffee() {
		return icoffee.makeCoffee()+" ,Sugar";
	}

}
