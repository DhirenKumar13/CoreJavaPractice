package org.core.java.practices;

class Java{
	static {
		System.out.println("parent class static block ..");
	}
	public Java() {
		System.out.println("parent class constructor..");
	}
	{
		System.out.println("Parent class instance block");
	}
}

class Spring extends Java{
	static {
		System.out.println("child class static block ..");
	}
	public Spring() {
		System.out.println("Child class constructor ..");
	}
	{
		System.out.println("Child class instance block ..");
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Java child = new Spring();
		System.out.println(child);
		Class<?> myClass = Class.forName("org.core.java.practices.Spring");
		System.out.println(myClass.newInstance());
	}

}
