package statePattern;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		StartStage startState = new StartStage();
		startState.doAction(context);
		System.out.println(context.getCurrentState().toString());
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getCurrentState().toString());
	}

}
