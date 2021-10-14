package compositeVisitorPattern;

public class Main {

	public static void main(String[] args) {
		Composite ceo = new Composite("CEO");
		Composite manager1 = new Composite("Sale Manager");
		Composite manager2 = new Composite("Marketing Manager");
		
		Leaf sales_assistance1 = new Leaf("Sales Assistant 1");
		Leaf sales_assistance2 = new Leaf("Sales Assistant 2");
		Leaf marketing_assistance = new Leaf("Marketing Assistant");
		
		manager1.addComponent(sales_assistance1);
		manager1.addComponent(sales_assistance2);
		manager2.addComponent(marketing_assistance);
		ceo.addComponent(manager1);
		ceo.addComponent(manager2);
		
		ceo.printTree();
		
		Visitable visitable = manager1;
		visitable.accept(new ConcreateVisitor());
		
		
	}

}

