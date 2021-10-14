package chainOfResponsibility;

public class BackEndLayer implements IContext {

	@Override
	public void help(int i) {
		System.out.println("BackEnd Layer Works");
	}

}
