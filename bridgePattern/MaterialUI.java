package bridgePattern;

public class MaterialUI extends UIBridgeAbstration {
	
	
	public MaterialUI(IOS ios) {
		super(ios);
	}

	@Override
	public String operate() {
		return ios.operate();
	}

	@Override
	public String menu() {
		return "Material Menu";	
	}

	@Override
	public String sideBarBtn() {
		return "Material SideBar";
	}

	@Override
	public String button() {
		return "Material Button";
	}

}
