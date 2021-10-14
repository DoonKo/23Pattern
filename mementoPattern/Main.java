package mementoPattern;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state 1");
		originator.setState("state 2");
		
		careTaker.addMemento(originator.saveStatetoMemento());
		
		originator.setState("State 3");
		originator.setState("State 4");
		
		careTaker.addMemento(originator.saveStatetoMemento());
		
		originator.setState("State 5");
		
		careTaker.addMemento(originator.saveStatetoMemento());
		
		System.out.println("The first save state :: "+careTaker.getMemento(0).getState());
		System.out.println("The second save state:: "+careTaker.getMemento(1).getState());
		System.out.println("The Third save state:: "+careTaker.getMemento(2).getState());
	}

}
