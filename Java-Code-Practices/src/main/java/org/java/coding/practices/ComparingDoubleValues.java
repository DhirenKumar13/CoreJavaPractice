package org.java.coding.practices;

import java.util.ArrayList;
import java.util.List;

public class ComparingDoubleValues {

	public static void main(String[] args) {
		
		final double d1 = Double.NaN;
		final double d2 = Double.NaN;
		
		System.out.println(d1 == d2);
		
		System.out.println(d1);
		System.out.println(Double.compare(d1, d2) == 0);
		
		final double d = 1 / 2;
		System.out.println(d);
		
		final double d11 = 1.0 / 2;
		System.out.println(d11);
		
		final double d22 = 1 / 2.0;
		System.out.println(d22);
		
		final double d33 = 1f / 2;
		System.out.println(d33);
		
		final List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		list.remove(2);
		System.out.println(list);
		
	}

}
