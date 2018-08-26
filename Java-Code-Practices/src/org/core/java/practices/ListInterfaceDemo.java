package org.core.java.practices;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println(list);
		list.add(0,20);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);
		list1.addAll(list);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.addAll(0,list);
		System.out.println(list2);
		
		Object[] obj = list2.toArray();
		System.out.println(obj.length);
		
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(list);
		finalList.addAll(list1);
		finalList.addAll(list2);
		System.out.println(finalList);
		
		finalList.removeAll(list2);
		finalList.retainAll(list1);
		System.out.println(finalList);
	}

}
