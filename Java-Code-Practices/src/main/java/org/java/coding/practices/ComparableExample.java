package org.java.coding.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableExample {
	public static void main(String a[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		System.out.println("List before sorting..");
		list.forEach(item -> System.out.println(item));
		Collections.sort(list);
		System.out.println("List after sorting..");
		list.forEach(item -> System.out.println(item));
	}
}
