package strategyPatternWrongOneNeedFix;

public class Main {

	public static void main(String[] args) {
		//No matter what is polymorphism type only generic code will work cuz of inheritance
		Vehicle vehicle = new Jet();
		System.out.println(vehicle.go());
	}

}
