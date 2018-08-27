package org.java.coding.practices;

public class StaticMethodCalls {

	public static void m1(int a) {
		System.out.println("int a");
	}

	public static void m1(long a) {
		System.out.println("long a");
	}

	public static void m1(double a) {
		System.out.println("double a");
	}

	public static void main(String[] args) {
		Byte b = 1;
		m1(b);
		m1('c');
	}

}
