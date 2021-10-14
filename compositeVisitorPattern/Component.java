package compositeVisitorPattern;

public abstract class Component implements Visitable {
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
