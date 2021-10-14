package factoryPattern;

public class RobotToyFactory extends ToyFactoryAbstraction {

	@Override
	public IToy createToy() {
		return new RobotToy();
	}

}
