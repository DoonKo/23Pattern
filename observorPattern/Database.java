package observorPattern;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {
	private String operation ;
	private String record;
	private List<Observer> observers = new ArrayList<>();
 	@Override
	public void registerObservor(Observer observer) {
 		observers.add(observer);
	}

	@Override
	public void removeObservor(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(operation, record);
		}
	}
	
	public void editRecord(String operation,String record) {
		this.operation = operation;
		this.record = record;
		notifyObserver();
	}
}
