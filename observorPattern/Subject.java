package observorPattern;

public interface Subject {
	void registerObservor(Observer observor);
	void removeObservor(Observer observor);
	public void notifyObserver();
}
