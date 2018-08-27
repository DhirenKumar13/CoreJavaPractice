package org.java.coding.practices;

import java.util.Arrays;
import java.util.Comparator;

public class WordOfASentenceExample {

	public static void main(String[] args) {
		String words = "I love India is the basic beauty.";
		String returnOrdered = returnOrdered(words);
		System.out.println(returnOrdered);
	}
	
	static String returnOrdered(String words) {
		String[] word = words.split(" ");
		System.out.println(Arrays.toString(word));
		Arrays.asList(word).sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println();
		System.out.println(Arrays.toString(word));
		String result = "";
		for(String wordsTemp : word) {
			result += wordsTemp.concat(" ");
		}
		return result.replace(".", "");
	}
}
