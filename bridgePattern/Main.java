package bridgePattern;

public class Main {

	public static void main(String[] args) {
		UIBridgeAbstration ui = new DarkUI(new Linux());
		
		System.out.println(ui.operate());
		System.out.println(ui.menu());
		System.out.println(ui.button());
		System.out.println(ui.sideBarBtn());
	}

}
