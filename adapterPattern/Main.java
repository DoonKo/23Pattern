package adapterPattern;

public class Main {

	public static void main(String[] args) {
		
		ITv tv = new ModernTVAdapter(new OldTvAdapatee());
		tv.switchOn();
		tv.switchOff();
	}

}
