package org.java.coding.practices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordSearchCount {

	public static void main(String[] args) {
		String findOccurance = "I am I and I am not yours ok";
		Pattern p = Pattern.compile("I");
		Matcher m = p.matcher(findOccurance);
		int count = 0;
		while(m.find()) {
			count++;
		}
		System.out.println("No of occurances are : "+count);
	}

}
