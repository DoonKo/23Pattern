package observorPattern;

public class Boss implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Boss says "+operation+" is performed on "+record);
	}

}
