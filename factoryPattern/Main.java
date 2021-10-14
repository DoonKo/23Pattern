package factoryPattern;

public class Main {

	public static void main(String[] args) {
		ToyFactoryAbstraction toyFactory = new RobotToyFactory();
		IToy toy = toyFactory.createToy();
		System.out.println(toy.makeToy());
		
		
	}

}
