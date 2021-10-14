package interpretorPattern;

public class IntToBinary implements Expression {
	
	private int i;
	
	public IntToBinary(int i) {
		super();
		this.i = i;
	}

	@Override
	public String interpret(InterpretorContext context) {
		return context.getBinaryString(i);
	}

}
