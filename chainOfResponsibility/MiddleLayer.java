package chainOfResponsibility;

public class MiddleLayer implements IContext {
	
	private IContext iContext;
	private static final int MIDDLE_LAYER = 2;
	public MiddleLayer(chainOfResponsibility.IContext iContext) {
		super();
		this.iContext = iContext;
	}

	@Override
	public void help(int i) {
		if(i==MIDDLE_LAYER) {
			System.out.println("Middle layer work");
		}else {
			iContext.help(i);
		}
	}

}
