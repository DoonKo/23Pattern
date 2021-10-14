package factoryPattern;

public class TrainToyFactory extends ToyFactoryAbstraction {

	@Override
	public IToy createToy() {
		return new TrainToy();
	}

}
