package chainOfResponsibility;

public class FrontEndLayer implements IContext {

	private  IContext iContext;
	private static final int FRONT_END = 1;
	
	public FrontEndLayer(IContext iContext) {
		super();
		this.iContext = iContext;
	}

	@Override
	public void help(int i) {
		if(FRONT_END== i) {
			System.out.println("FrontEnd Layer Work!");
		}else {
			iContext.help(i);
		}
	}
}
