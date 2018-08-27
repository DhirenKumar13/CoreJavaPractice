package org.java.coding.practices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyCustomComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		if(p1.getAge() < p2.getAge()) return -1;
		if(p1.getAge() > p2.getAge()) return 1;
		else return 0;
	}
}
class Person {
	private String name;
	private Integer age;
	public Person() {}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class ComparatorExampleCustomClassObject {
	public static void main(String a[]) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Dhiren",23));
		list.add(new Person("Anushka",28));
		list.add(new Person("Disha",26));
		list.add(new Person("Virat",29));
		list.add(new Person("Shruti",24));
		System.out.println("List before sorting..");
		list.forEach(item -> System.out.print(item));
		list.sort(new MyCustomComparator());
		System.out.println();
		System.out.println("List after sorting..");
		list.forEach(item -> System.out.print(item));
	}
}
