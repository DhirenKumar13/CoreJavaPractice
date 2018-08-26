package org.core.java.practices;

class StudentDemo{
	String name;
	Integer id;
	Double average;
	
	StudentDemo(String name,Integer id,Double average){
		this.name = name;
		this.id = id;
		this.average = average;
	}
	
	@Override
	public String toString(){
		return name + " has an id " +id + " average as "+average; 
	}
}

public class ToStringOverrideDemo {

	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo("Dhiren",24,99.0);
		StudentDemo s2 = new StudentDemo("Dhiren",24,99.0);
		System.out.println(s1);
		System.out.println(s2);
	}

}
