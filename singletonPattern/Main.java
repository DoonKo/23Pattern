package singletonPattern;

public class Main {
	public static void main(String args[]) {
		MyInstance obj1 = MyInstance.getInstance();
		MyInstance obj2 = MyInstance.getInstance();
		MyInstance obj3 = MyInstance.getInstance();
		boolean test = obj1.equals(obj3);//checking they are refering the same object.Only one object.That why can use both == and .equal.(cuz checking the memory address)
		System.out.println(test);
		System.out.println(obj1+" ||||| "+obj3);
	}
}
