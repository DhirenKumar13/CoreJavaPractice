package org.java.coding.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PersonType implements Comparable<PersonType>{
	private String name;
	private Integer age;
	public PersonType() {}
	public PersonType(String name, Integer age) {
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
	@Override
	public int compareTo(PersonType p) {
		if(this.getAge() < p.getAge()) return 1;
		if(this.getAge() > p.getAge()) return -1;
		else return 0;
	}
}

public class ComparableExampleCustomClassObject {
	public static void main(String a[]) {
		List<PersonType> list = new ArrayList<>();
		list.add(new PersonType("Dhiren",23));
		list.add(new PersonType("Anushka",28));
		list.add(new PersonType("Disha",26));
		list.add(new PersonType("Virat",29));
		list.add(new PersonType("Shruti",24));
		System.out.println("List before sorting..");
		list.forEach(item -> System.out.print(item));
		Collections.sort(list);
		System.out.println();
		System.out.println("List after sorting..");
		list.forEach(item -> System.out.print(item));
	}
}
