package strategyPattern;

public class FormulaOne extends Vehicle {
	public FormulaOne() {
		setAlgo(new GoByDrivingAlgo());
	}
}
