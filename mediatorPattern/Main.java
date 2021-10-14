package mediatorPattern;

public class Main {

	public static void main(String[] args) {
		IMediator iMediator = new TelenorMediatorConcreate();
		Chatter ch1 = new Chatter("Thaw Thaw", iMediator);
		Chatter ch2 = new Chatter("Phaw Phaw", iMediator);
		Chatter ch3 = new Chatter("Thaw Phaw", iMediator);
		
		ch1.sendMessage("Hi");
		ch2.sendMessage("Hello");
		ch3.sendMessage("Hello Hi");
	}

}
