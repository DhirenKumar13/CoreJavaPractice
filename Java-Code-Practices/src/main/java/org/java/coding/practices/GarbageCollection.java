package org.java.coding.practices;

import java.util.Arrays;

public class GarbageCollection {

	public static void main(String[] args) {
		GarbageCollection gc = new GarbageCollection();
		GarbageCollection gc1 = new GarbageCollection();
		gc = null;
		System.gc();
		gc1 = null;
		System.gc();
		System.out.println("D");
		
		int []a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
	}
	
	public void finalize() {
		System.out.println("Dhiren");
	}
	
	

}
