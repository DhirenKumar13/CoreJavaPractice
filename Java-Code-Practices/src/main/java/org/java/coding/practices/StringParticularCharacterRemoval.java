package org.java.coding.practices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParticularCharacterRemoval {

	public static void main(String[] args) {
		String str = "I love Anushka";
		String removeFromIndex = removeFromIndex(str, 3);
		System.out.println(removeFromIndex);
		String removeParticularChar = removeParticularChar(str, 'A');
		System.out.println(removeParticularChar);
	}

	public static String removeFromIndex(String str, int position) {
		char c = str.charAt(position - 1);
		return str.replace(c, ' ');
	}

	public static String removeParticularChar(String str, char ch) {
		String a = String.valueOf(ch);

		Matcher matcher = Pattern.compile(a).matcher(str);
		String result = "";
		while (matcher.find()) {
			result = str.replace(ch, ' ');
		}
		return result;
	}

}
