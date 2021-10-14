package visitorPattern;

public class ConcreateVisitable2 implements IVisitable {
	private String name;
	
	public ConcreateVisitable2(String name) {
		super();
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
