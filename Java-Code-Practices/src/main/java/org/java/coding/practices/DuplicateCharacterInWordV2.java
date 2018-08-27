package org.java.coding.practices;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInWordV2 {

	public static void main(String[] args) {
		String test = "tttttttaaaaaaesssssjhtz";
		dulicateCharacter(test);
	}

	static void dulicateCharacter(String word) {
		char[] charArray = word.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		
		System.out.println(map);
		
		map.forEach((k,v) -> {
			System.out.println(map.get(k) + " :: " +k);
		});
	}

}