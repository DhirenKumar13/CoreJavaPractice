package org.core.java.practices;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatorDemo implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return - a.compareTo(b);
	}
	
}

class MyComparatorDemo1 implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return b.compareTo(a);
	}
	
}

public class SortingOrderDemo2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>(new MyComparatorDemo());
		TreeSet<Integer> tree1 = new TreeSet<>(new MyComparatorDemo1());
		tree.add(0);
		tree.add(10);
		tree.add(05);
		tree.add(15);
		tree.add(20);
		tree.add(25);
		tree.add(25);
		tree1 = tree;
		System.out.println(tree);
		System.out.println(tree1);
	}

}
