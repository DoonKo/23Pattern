package strategyPattern;

public class Jet extends Vehicle {
	
	public Jet() {
		setAlgo(new GoByFlyingHigh());
	}
}
