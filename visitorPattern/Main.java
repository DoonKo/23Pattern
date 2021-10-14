package visitorPattern;

public class Main {

	public static void main(String[] args) {
		IVisitable visitable = new ConcreateVisitable1("Tokyo");
		IVisitable visitable1 = new ConcreateVisitable2("Saitama");
		visitable.accept(new ConcreateVisitor());
		visitable1.accept(new ConcreateVisitor2());
	}

}
