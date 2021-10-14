package compositeVisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> childComponents = new ArrayList<>();
	public Composite(String name) {
		super(name);
	}
	
	@Override
	public void printTree() {
		System.out.println("  "+getName());
		for(Component component:childComponents) {
			component.printTree();
		}
	}
	
	public void addComponent(Component component) {
		childComponents.add(component);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
