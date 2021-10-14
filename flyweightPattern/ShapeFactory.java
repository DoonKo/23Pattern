package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	static int x;
	static int y;
	static int radius;
	static int counter;
	
	private static Map<String,IShape> flyweight = new HashMap<>();
	
	public ShapeFactory(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public static IShape create(String color) {
		Circle circle = (Circle)flyweight.get(color);
		if(circle==null) {
			circle = new Circle(x,y,radius);
			circle.setColor(color);
			System.out.println(color+" Circle is created::"+(++counter));
			flyweight.put(color, circle);
			
		}else {
			System.err.println("Duplicate object is not created");
		}
		return circle;
	}
}
