package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		BackEndLayer backEndLayer = new BackEndLayer();
		MiddleLayer middleLayer = new MiddleLayer(backEndLayer);
		FrontEndLayer fontEndLayer = new FrontEndLayer(middleLayer);
		
		fontEndLayer.help(3);
	}

}
