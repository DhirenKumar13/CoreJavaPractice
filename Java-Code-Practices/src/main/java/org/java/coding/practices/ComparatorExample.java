package org.java.coding.practices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if(i1<i2) return -1;
		if(i1>i2) return 1;
		else return 0;
	}
}

public class ComparatorExample {
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
		list.sort(new MyComparator());
		System.out.println("List after sorting..");
		list.forEach(item -> System.out.println(item));
	}
}
