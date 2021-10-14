package templatePattern;

public abstract class PizzaAbstraction {
	
	public final void makePizza() {
		prepared();
		baked();
		serve();
	}
	
	public abstract void prepared();
	public abstract void baked();
	public abstract void serve();
}
