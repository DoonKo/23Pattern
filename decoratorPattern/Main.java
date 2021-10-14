package decoratorPattern;

public class Main {

	public static void main(String[] args) {
		ICoffee coffee = 
			new TopplingDecorator(new CreamerDecorator
					(new SugarDecorator(new  MilkDecorator(new PlainCoffee())))) ;
		System.out.println(coffee.makeCoffee());
	}

}
