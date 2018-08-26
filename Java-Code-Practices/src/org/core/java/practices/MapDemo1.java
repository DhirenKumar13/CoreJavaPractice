package org.core.java.practices;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Integer a = map.put("Dhiren", 99);
		System.out.println(a);
		Integer b = map.put("Dhiren", 100);
		System.out.println(b);
		Map<String,Integer> mapNew = new HashMap<>();
		mapNew.putAll(map);
		System.out.println(map + " old map");
		System.out.println(mapNew + " new map");
		Integer value = mapNew.get("Dhiren");
		System.out.println(value);
		System.out.println(mapNew.containsKey("Dhiren") + " contains the key as dhiren ?");
		System.out.println(mapNew.containsValue(100) + " contains the key as dhiren ?");
		System.out.println(mapNew.isEmpty() + " does the map is empty ?");
		System.out.println(mapNew.size() + " size of map before clear()");
		mapNew.clear();
		System.out.println(mapNew.size() + " size of map after clear()");
	}

}
