package observorPattern;

public class Client implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Client says "+operation+" is performed on "+record);
	}

}
