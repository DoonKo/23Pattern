package compositePattern;

public abstract class Component {
	private String name;

	public Component(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public abstract void printTree();
}
