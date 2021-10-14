package flyweightPattern;

public class Circle implements IShape {
	private final int x;
	private final int y;
	private final int radius;
	private String color;
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	public String toString() {
		return "[Circle "+x+" "+y+" "+radius+" ]";
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void draw() {
		System.out.println("Draw "+getColor()+"[Circle "+x+" "+y+" "+radius+" ]");
	}
}	
