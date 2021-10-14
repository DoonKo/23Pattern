package observorPattern;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		Boss boss = new Boss();
		Manager manager = new Manager();
		Client client = new Client();
		
		db.registerObservor(boss);
		db.registerObservor(manager);
		db.registerObservor(client);
		db.removeObservor(client);
		
		db.editRecord("delete", "row 1");
	}

}
