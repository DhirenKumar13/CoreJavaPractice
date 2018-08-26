package org.core.java.practices;

class Person{
	public Person get() {
		return this;
	}
	public void myObject() {
		System.out.println("Person class myObject() called");
	}
}

class Student extends Person{
	@Override
	public Student get() {
		return this;
	}
	public void myObject() {
		System.out.println("Student class myObject() called");
	}
}

public class CoverientReturnDemo {

	public static void main(String[] args) {
		Person p = new Student();
		p.get().myObject();
		
		Student s = new Student();
		s.get().myObject();
	}

}
