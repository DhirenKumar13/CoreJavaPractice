package org.core.java.practices;

class Parent{
	public Parent() {
		System.out.println("parent class constructor..");
	}
	public Parent(String name){
		this();
		System.out.println("My name is "+name);
	}
	{
		System.out.println("Parent class instance block");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("Child class constructor..");
	}
	{
		System.out.println("Child class instance block");
	}
}

public class InstanceBlockDemo {

	public static void main(String[] args) {
		new Child();
	}

}
