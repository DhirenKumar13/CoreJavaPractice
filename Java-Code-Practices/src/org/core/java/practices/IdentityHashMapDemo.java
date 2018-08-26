package org.core.java.practices;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		hashmap.put(i1,"Dhiren");
		hashmap.put(i2,"Anushka");
		
		System.out.println("Without Using Identity hashmap .");
		
		System.out.println(hashmap);
		
		System.out.println("Using Identity hashmap .");
		
		Map<Integer, String> identityhashmap = new IdentityHashMap<>();
		
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		identityhashmap.put(i3,"Dhiren");
		identityhashmap.put(i4,"Anushka");
		
		System.out.println(identityhashmap);
		
	}

}
