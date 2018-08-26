package org.core.java.practices;

class Animal{
	
}

class Dog extends Animal{
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
		a = null;
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
		
	}

}
