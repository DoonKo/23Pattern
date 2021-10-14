package proxyPattern;

public class Main {

	public static void main(String[] args) {
		ISubject obj = new ProxySubject(new RealSubject());
		obj.doSomething();

	}

}
