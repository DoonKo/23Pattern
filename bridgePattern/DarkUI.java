package bridgePattern;

public class DarkUI extends UIBridgeAbstration {

	public DarkUI(IOS ios) {
		super(ios);
	}

	@Override
	public String operate() {
		return ios.operate();
	}

	@Override
	public String menu() {
		return "Dark Menu";
	}

	@Override
	public String sideBarBtn() {
		return "Dark SideBar";
	}

	@Override
	public String button() {
		return "Dark Button";
	}

}
