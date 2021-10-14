package statePattern;

public class StartStage implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	
	public String toString() {
		return "Start Stage is starting now";
	}

}
