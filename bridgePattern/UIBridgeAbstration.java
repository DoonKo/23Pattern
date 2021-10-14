package bridgePattern;

public abstract class UIBridgeAbstration {
	
	protected IOS ios;

	public UIBridgeAbstration(IOS ios) {//using interface as a parameter.can use every child of interface
		super();
		this.ios = ios;
	}
	
	//for OS
	public abstract String operate();
	
	//forUI
	public abstract String menu();
	public abstract String sideBarBtn();
	public abstract String button();
}
