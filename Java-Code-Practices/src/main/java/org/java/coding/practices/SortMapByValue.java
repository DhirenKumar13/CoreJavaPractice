package org.java.coding.practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Dhiren", 100);
		map.put("Anushka", 99);
		map.put("Disha", 90);
		map.put("Shruti", 50);
		map.put("Rohit", 10);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		entryList.sort((p1, p2) -> p1.getValue() - p2.getValue());
		entryList.forEach(item -> System.out.print( item +" , "));
	}
}
