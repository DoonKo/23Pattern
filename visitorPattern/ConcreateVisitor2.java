package visitorPattern;

public class ConcreateVisitor2 implements IVisitor {

	@Override
	public void visit(ConcreateVisitable1 concreateVisitable1) {
		System.out.println("ConcreateVistor2 visit "+concreateVisitable1.getName());
	}

	@Override
	public void visit(ConcreateVisitable2 concreateVisitable2) {
		System.out.println("ConcreateVistor2 visit "+concreateVisitable2.getName());
	}

}
