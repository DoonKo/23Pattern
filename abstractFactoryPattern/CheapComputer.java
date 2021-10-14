package abstractFactoryPattern;

public class CheapComputer extends ComputerAbstractFactory {

	@Override
	public IMemory createMemory() {
		return new LowMemory();
	}

	@Override
	public IMonitor createMonitor() {
		return new LowResolutionMonitor();
	}

	@Override
	public IHardDisk createHardDisk() {
		return new HDD();
	}

}
