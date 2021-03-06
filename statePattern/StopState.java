package statePattern;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	public String toString() {
		return "Stop Stage is starting now";
	}
}
