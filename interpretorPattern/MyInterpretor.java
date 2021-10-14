package interpretorPattern;

public class MyInterpretor {
	
	private InterpretorContext context;
	
	public MyInterpretor(InterpretorContext context) {
		super();
		this.context = context;
	}

	public String interpret(String s) {
		Expression expression = null;
		if(s.contains("Binary")) {
			expression = new IntToBinary(Integer.parseInt(s.substring(0, s.indexOf("  "))));
		}
		else if(s.contains("HexaDecimal")) {
			expression = new IntToHexa(Integer.parseInt(s.substring(0, s.indexOf(" "))));
		}
		
		return expression.interpret(context);
	}
	
	public static void main(String[] args) {
		String s1 = "28 in Binary";
		String s2 = "28 in HexaDecimal";
		MyInterpretor obj = new MyInterpretor(new InterpretorContext());
		System.out.println(s1+" :: "+obj.interpret(s1));
		System.out.println(s2+" :: "+obj.interpret(s2));
	}

}
