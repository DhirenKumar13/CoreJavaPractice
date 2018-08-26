package org.core.java.practices;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("Dhiren is a good boy ."," ");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken(" "));
		}
	}

}
