package statePattern;

public class Context {
	private State state;
	
	public State getCurrentState() {
		return this.state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
