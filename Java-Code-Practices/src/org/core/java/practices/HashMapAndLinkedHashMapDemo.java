package org.core.java.practices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapAndLinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<>();

		hashmap.put("Dhiren", 100);
		hashmap.put("Anushka", 99);
		hashmap.put("Virat", 98);
		hashmap.put("Rohit", 97);

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("Dhiren", 100);
		linkedHashMap.put("Anushka", 99);
		linkedHashMap.put("Virat", 98);
		linkedHashMap.put("Rohit", 97);

		System.out.println(hashmap + " using hashmap .");
		System.out.println(linkedHashMap + " using linked hashmap .");
	}

}
