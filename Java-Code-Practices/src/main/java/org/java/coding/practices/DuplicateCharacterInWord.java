package org.java.coding.practices;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateCharacterInWord {

	static Map<Character,Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		String test = "tttttttaaaaaaesssssjhtz";
		dulicateCharacter(test);
	}
	
	static void dulicateCharacter(String word) {
		char[] charArray = word.toCharArray();

		for(char ch : charArray) {
			findOccurance(ch,word);
		}
		
		map.forEach((k,v) -> {
			System.out.println(map.get(k) + " :: " +k);
		});
	}
	
	static void findOccurance(char ch, String word) {
		String s = Character.toString(ch);
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher(word);
		int counter = 0;
		while(m.find()) {
			counter++;
		}
		map.put(ch, counter);
	}
}