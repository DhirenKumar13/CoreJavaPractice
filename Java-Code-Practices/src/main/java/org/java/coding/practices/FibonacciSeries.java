package org.java.coding.practices;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter the range...");
		Scanner scanner = new Scanner(System.in);
		int level = scanner.nextInt();
		
		// 0 1 1 2 3 5 8 13 ....
		int array[] = new int[level] ;
		
		array[0] = 0;
		array[1] = 1;

		for(int i = 2 ; i < level ; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(Arrays.toString(array));
		scanner.close();
	}

}
