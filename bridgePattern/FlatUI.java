package bridgePattern;

public class FlatUI extends UIBridgeAbstration {

	public FlatUI(IOS ios) {
		super(ios);
	}

	@Override
	public String operate() {
		return ios.operate();
	}

	@Override
	public String menu() {
		return "Flat Menu";
	}

	@Override
	public String sideBarBtn() {
		return "Flat sideBar";
	}

	@Override
	public String button() {
		return "Flat UI Button";
	}

}
