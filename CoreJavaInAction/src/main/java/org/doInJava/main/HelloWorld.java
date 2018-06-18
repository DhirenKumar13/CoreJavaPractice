package org.doInJava.main;

public class HelloWorld {
	
	public static void m3() {
		System.out.println("In m3()");
	}

	public static void main(String[] args) {
		System.out.println("Hello World ...");
		HelloIndia india = new HelloIndia(23);
		india.m1();
		HelloIndia.m2();
		HelloWorld.m3();
	}

}

class HelloIndia {
	
	private Integer age ;
	
	public HelloIndia(Integer a) {
		this.age = a;
	}

	public void m1() {
		System.out.println("I am in m1() => "+age);
	}
	
	public static void m2() {
		System.out.println("I am in m2()");
	}
	
}