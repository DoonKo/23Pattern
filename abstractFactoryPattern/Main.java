package abstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		ComputerAbstractFactory factory = new ExpensiveComputer();
		System.out.println(factory.createHardDisk().show());
		System.out.println(factory.createMemory().show());
		System.out.println(factory.createMonitor().show());
	}

}
