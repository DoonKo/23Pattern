package proxyPattern;

public class ProxySubject implements ISubject {
	
	private RealSubject realSubject;
	
	
	public ProxySubject(RealSubject realSubject) {
		super();
		this.realSubject = realSubject;
	}


	@Override
	public void doSomething() {
		doSomethingExtra();    //method from proxy will work first and can control realsubject method 
		realSubject.doSomething();
	}
	
	public void doSomethingExtra() {
		System.out.println("Proxy do something extra...........");
	}

}
