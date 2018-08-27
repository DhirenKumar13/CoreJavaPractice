package org.java.coding.practices;

public class EqualsAndHashcodeContract {

	public static void main(String[] args) {
		String a = "Aa";
		String b = "Aa";
		String c = "BB";

		System.out.println("Checking Equality");
		System.out.println(a.equals(b) + " A equals B"); // true
		System.out.println(a.equals(c) + " A equals C"); //false
		
		System.out.println("Checking hashcode");
		System.out.println(a.hashCode() + " A hashcode"); 
		System.out.println(b.hashCode() + " B hashcode");
		System.out.println(c.hashCode() + " C hashcode");
		
		Integer i1 = 127;
		Integer i2 = 120;
		System.out.println(i1.equals(i2)); // false
		System.out.println(i1 == i2); // false
	}

}
