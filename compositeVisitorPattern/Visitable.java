package compositeVisitorPattern;

public interface Visitable {
	void accept(Visitor visitor);
}
