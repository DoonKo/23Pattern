package visitorPattern;

public interface IVisitor {
	
	void visit(ConcreateVisitable1 concreateVisitable1);
	void visit(ConcreateVisitable2 concreateVisitable2);
}
