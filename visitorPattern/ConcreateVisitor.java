package visitorPattern;

public class ConcreateVisitor implements IVisitor {
	

	@Override
	public void visit(ConcreateVisitable1 concreateVisitable1) {
		System.out.println("ConcreateVisitor visit "+concreateVisitable1.getName());
		
	}

	@Override
	public void visit(ConcreateVisitable2 concreateVisitable2) {
		System.out.println("ConcreateVisitor visit "+concreateVisitable2.getName());
	}
	
	

}
