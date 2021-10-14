package compositeVisitorPattern;

public class ConcreateVisitor implements Visitor {

	@Override
	public void visit(Component component) {
		System.out.println("ConcreateVisitor visit "+component.getName());
	}

}
