package org.java.coding.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInitialCapacity {

	public static void main(String[] args) {
		// initial capacity 10
		List<Integer> list = new ArrayList<>();
		
		// initial capacity 16
		Set<Integer> set = new HashSet<>();
		Set<Integer> linkedSet = new LinkedHashSet<>();
		
		// initial capacity 10
		Map<Integer,String> map = new HashMap<>();
		
		list.add(0);
		set.add(0);
		linkedSet.add(0);
		map.put(0, "A");
		
		System.out.println(list.size());
	}

}
