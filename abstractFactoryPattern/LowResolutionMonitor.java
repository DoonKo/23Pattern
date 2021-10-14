package abstractFactoryPattern;

public class LowResolutionMonitor implements IMonitor {

	@Override
	public String show() {
		return "LowResolutionMonitor";
	}

}
