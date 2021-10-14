package strategyPattern;

public class Helicopter extends Vehicle {
	public Helicopter() {
		setAlgo(new GoByFlyAlgo());
	}
}
