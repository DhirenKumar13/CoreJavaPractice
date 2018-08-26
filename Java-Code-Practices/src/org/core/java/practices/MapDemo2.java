package org.core.java.practices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Dhiren", 100);
		map.put("Anushka", 99);
		map.put("Virat", 98);
		map.put("Rohit", 97);
		
		Set<String> set = map.keySet();
		System.out.println("The keys of the map are :"+set);
		
		Collection<Integer> values = map.values();
		System.out.println("The values of the map are :"+values);
		
		Set<Entry<String,Integer>> setEntry = map.entrySet();
		System.out.println("Entries to the map are :"+setEntry);
		
		Iterator itr = setEntry.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Integer> mapEntry = (Map.Entry<String, Integer>) itr.next();
			if("Rohit".equals(mapEntry.getKey())) {
				System.out.println("The key that i got is "+mapEntry.getKey());
				System.out.println("The value for the above key is "+mapEntry.getValue());
				mapEntry.setValue(0);
				System.out.println("The key that i got is "+mapEntry.getKey());
				System.out.println("The updated value for the above key is "+mapEntry.getValue());
			}else {
				System.out.println("The key that i got is "+mapEntry.getKey());
				System.out.println("The value for the above key is "+mapEntry.getValue());
			}
		}
	}

}
