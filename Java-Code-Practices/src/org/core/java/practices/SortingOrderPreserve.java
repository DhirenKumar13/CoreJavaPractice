package org.core.java.practices;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparatorImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return 1 ;
	}
	
}

public class SortingOrderPreserve {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>(new MyComparatorImpl());
		tree.add(0);
		tree.add(10);
		tree.add(05);
		tree.add(25);
		tree.add(15);
		tree.add(20);
		tree.add(25);
		System.out.println(tree);
	}

}
