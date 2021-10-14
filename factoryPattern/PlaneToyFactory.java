package factoryPattern;

public class PlaneToyFactory extends ToyFactoryAbstraction {

	@Override
	public IToy createToy() {
		return new PlaneToy();
	}

}
