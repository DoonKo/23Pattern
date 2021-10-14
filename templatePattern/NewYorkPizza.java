package templatePattern;

public class NewYorkPizza extends PizzaAbstraction {

	@Override
	public void prepared() {
		System.out.println("NewYork Pizza prepared");
	}

	@Override
	public void baked() {
		System.out.println("NewYork Pizza baked");

	}

	@Override
	public void serve() {
		System.out.println("NewYork Pizza serve");

	}

}
