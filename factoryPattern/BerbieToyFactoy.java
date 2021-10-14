package factoryPattern;

public class BerbieToyFactoy extends ToyFactoryAbstraction {

	@Override
	public IToy createToy() {
		return new BerbieToy();
	}

}
