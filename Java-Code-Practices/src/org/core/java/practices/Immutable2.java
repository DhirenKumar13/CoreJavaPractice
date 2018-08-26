package org.core.java.practices;

public class Immutable2 {

	public static void main(String[] args) {
		String a = "Hello";
		String c = new String("Hello");
		
		a.concat(" World !!!");
		c.concat(" Java !!!");
		
		System.out.println(a +" with string literal ");
		System.out.println(c +" using new() ");
		
		String b = a;
		System.out.println("Before changing a , b object is : "+b);
		
		a = a.concat(" Dhiren");
		
		System.out.println("After changing a , a object becomes : "+a);
		System.out.println("After changing a , b object becomes : "+b);
	}

}
