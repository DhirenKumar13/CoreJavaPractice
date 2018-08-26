package org.core.java.practices;

public class MethodOverloadingtest {
	
	public static long add(int a , long b ) {
		return a + b;
	}
	
	public static long add(int a , int b ,int c) {
		return a + b + c ;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		char ch = 65;
		System.out.println(MethodOverloadingtest.add(a, b));
		System.out.println(MethodOverloadingtest.add(a, ch));
		System.out.println(MethodOverloadingtest.add(a, b, c));
	}

}
