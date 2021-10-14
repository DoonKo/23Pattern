package visitorPattern;

public class ConcreateVisitable1 implements IVisitable {
	private String name;
	
	public ConcreateVisitable1(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
