package singletonPattern;

public class MyInstance {
		
	private static MyInstance myInstance;
	private MyInstance(){
		
	}
	
	public static MyInstance getInstance() {
		if(myInstance==null) {
			myInstance = new MyInstance();
		}
		return myInstance;
	}
}
