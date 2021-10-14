package interpretorPattern;

public class IntToHexa implements Expression {
	
	private int i;
	
	public IntToHexa(int i) {
		super();
		this.i = i;
	}

	@Override
	public String interpret(InterpretorContext context) {
		return context.getHexaString(i);
	}

}
