package abstractFactoryPattern;

public class LowMemory implements IMemory {

	@Override
	public String show() {
		return "Low Memory";
	}

}
