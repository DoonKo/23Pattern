package templatePattern;

public class ChicagoPizza extends PizzaAbstraction {

	@Override
	public void prepared() {
		System.out.println("Chicago Pizza prepared");
	}

	@Override
	public void baked() {
		System.out.println("Chicago Pizza baked");

	}

	@Override
	public void serve() {
		System.out.println("Chicago Pizza serve");

	}

}
