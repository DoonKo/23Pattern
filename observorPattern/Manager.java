package observorPattern;

public class Manager implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Manager says "+operation+" is performed on "+record);
	}

}
