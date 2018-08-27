package org.java.coding.practices;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueJava8 {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Dhiren", 100);
		unsortedMap.put("Anushka", 99);
		unsortedMap.put("Disha", 90);
		unsortedMap.put("Shruti", 50);
		unsortedMap.put("Rohit", 10);

		Map<String, Integer> collectBykey = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry<String, Integer>::getKey, Map.Entry<String, Integer>::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collectBykey);

		System.out.println("################## Reversed Keys ########################");

		Map<String, Integer> collectBykeyReversed = unsortedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry<String, Integer>::getKey, Map.Entry<String, Integer>::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collectBykeyReversed);

		System.out.println("##########################################");

		Map<String, Integer> collectByValue = unsortedMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry<String, Integer>::getKey, Map.Entry<String, Integer>::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collectByValue);

		System.out.println("################# Reversed Values #########################");

		Map<String, Integer> collectByValueReversed = unsortedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry<String, Integer>::getKey, Map.Entry<String, Integer>::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collectByValueReversed);

	}
}
