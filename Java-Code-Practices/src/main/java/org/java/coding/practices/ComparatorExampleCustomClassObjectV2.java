package org.java.coding.practices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PersonV2 {
	private String name;
	private Integer age;
	public  PersonV2() {}
	public  PersonV2(String name, Integer age) {
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

public class ComparatorExampleCustomClassObjectV2 {
	public static void main(String a[]) {
		List<PersonV2> list = new ArrayList<>();
		list.add(new PersonV2("Dhiren",23));
		list.add(new PersonV2("Anushka",28));
		list.add(new PersonV2("Disha",26));
		list.add(new PersonV2("Virat",29));
		list.add(new PersonV2("Shruti",24));
		System.out.println("List before sorting..");
		list.forEach(item -> System.out.print(item));
		list.sort(new Comparator<PersonV2>() {
			@Override
			public int compare(PersonV2 p1, PersonV2 p2) {
				if(p1.getAge() < p2.getAge()) return -1;
				if(p1.getAge() > p2.getAge()) return 1;
				else return 0;
			}
		});

		System.out.println();
		System.out.println("List after sorting ascending..");
		list.forEach(item -> System.out.print(item));
		
		list.sort(new Comparator<PersonV2>() {
			@Override
			public int compare(PersonV2 p1, PersonV2 p2) {
				if(p1.getAge() < p2.getAge()) return 1;
				if(p1.getAge() > p2.getAge()) return -1;
				else return 0;
			}
		});
		
		list.sort((p1, p2) -> p1.getAge() - p2.getAge());
		
		System.out.println();
		System.out.println("List after sorting descending..");
		list.forEach(item -> System.out.print(item));
	}
}
