package decoratorPattern;

public class CreamerDecorator extends CoffeeDecoratorAbstraction {

	public CreamerDecorator(ICoffee icoffee) {
		super(icoffee);
	}

	@Override
	public String makeCoffee() {
		return icoffee.makeCoffee()+" ,Creamer";
	}

}
