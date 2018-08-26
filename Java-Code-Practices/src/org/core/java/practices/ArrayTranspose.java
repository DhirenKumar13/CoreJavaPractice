/**
	Given a 2D array A, your task is to convert all rows to columns and columns to rows.
	Input: 
	First line contains 2 space separated integers, N - total rows, M - total columns. 
	Each of the next N lines will contain M space separated integers.

	Output: 
	Print M lines each containing N space separated integers.
*/
package org.hackerearth.array;

import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int intArray[][];
		intArray = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				intArray[i][j] = sc.nextInt();
			}
		}
		for(int j=0;j<cols;j++) {
			for(int i=0;i<rows;i++) {
				System.out.print(intArray[i][j] + "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
