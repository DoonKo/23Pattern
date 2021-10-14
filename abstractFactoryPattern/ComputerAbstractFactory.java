package abstractFactoryPattern;

public abstract class ComputerAbstractFactory {
	public abstract IMemory createMemory();
	public abstract IMonitor createMonitor();
	public abstract IHardDisk createHardDisk();
}
