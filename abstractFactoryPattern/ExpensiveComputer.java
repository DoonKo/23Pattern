package abstractFactoryPattern;

public class ExpensiveComputer extends ComputerAbstractFactory {

	@Override
	public IMemory createMemory() {
		return new LargeMemory();
	}

	@Override
	public IMonitor createMonitor() {
		return new HighResolutionMonitor();
	}

	@Override
	public IHardDisk createHardDisk() {
		return new SSD();
	}

}
