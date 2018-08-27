package org.java.coding.practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapListOfStudents {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Dhiren");
		s1.addBook("Java");
		s1.addBook("NodeJS");
		s1.addBook("Spring Boot");
		
		Student s2 = new Student();
		s2.setName("Anushka");
		s2.addBook("ReactJS");
		s2.addBook("NodeJS");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		
		List<String> collectedList = studentList.stream()
					.map(student -> student.getBooks())
					.flatMap(student -> student.stream())
					.distinct()
					.collect(Collectors.toList());
		
		collectedList.forEach(System.out::println);
	}

}

class Student {
	
	private String name;
	private Set<String> books;

	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addBook(String book) {
		if(books == null) {
			books = new HashSet<>();
		}
		books.add(book);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", books=" + books + "]";
	}
}