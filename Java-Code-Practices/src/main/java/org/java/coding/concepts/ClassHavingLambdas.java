package org.java.coding.concepts;

import java.util.Arrays;
import java.util.List;

public class ClassHavingLambdas {
	static int sum = 0 ;
	public static void main(String... a) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.forEach(item -> sum = sum + item);
		System.out.println(sum);
	}
}
