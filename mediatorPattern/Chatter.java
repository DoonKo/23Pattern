package mediatorPattern;

public class Chatter {
	private String name;
	private IMediator iMediator;
	
	public Chatter(String name, IMediator iMediator) {
		super();
		this.name = name;
		this.iMediator = iMediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void sendMessage(String msg) {
		iMediator.sendMessage(this, msg);
	}
}
