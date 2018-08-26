package org.core.java.practices;

public class Immutable3 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode() + " s1 hashcode.");
		System.out.println(s2.hashCode() + " s2 hashcode.");
		System.out.println(s3.hashCode() + " s3 hashcode.");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}

}
