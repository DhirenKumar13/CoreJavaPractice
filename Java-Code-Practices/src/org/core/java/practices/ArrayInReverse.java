/**
 * 
 * @author Dhiren
 *
 *         Given the size and the elements of array A, print all the elements in
 *         reverse order.
 * 
 *         Input: First line of input contains, N - size of the array. Following
 *         N lines, each contains one integer, i{th} element of the array i.e.
 *         A[i].
 * 
 *         Output: Print all the elements of the array in reverse order, each
 *         element in a new line
 */
package org.hackerearth.array;

import java.util.Scanner;

public class ArrayInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int initialSizeOfArray = sc.nextInt();
		int intArray[];    //declaring array
		intArray = new int[initialSizeOfArray];  // allocating memory to array
		for (int i = 0; i < initialSizeOfArray; i++) {
			intArray[i] = sc.nextInt();
		}
		for (int i = intArray.length; i > 0; i--) {
			System.out.println(intArray[i-1]);
		}
		sc.close();
	}

}
