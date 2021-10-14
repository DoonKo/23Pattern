package flyweightPattern;

import java.util.Random;

public class Main {
	private static final String[] colors = {"Green","Red","Yellow","Blue"};
	public static void main(String[] args) {
		IShape shape = null;
		for(int i = 0;i<20;i++) {
			String color = colors[new Random().nextInt(colors.length)];
			shape = new ShapeFactory(new Random().nextInt(i+1),new Random().nextInt(i+1),new Random().nextInt(i+1)).create(color);
			
			((Circle)shape).draw();
		}
	}

}
