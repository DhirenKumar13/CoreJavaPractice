package org.core.java.hackerearth;

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
public class ArrayInReverse {
	
	public static void main(String[] args) {
		int num[] = {4,12,7,15,9};
		System.out.println(num.length);
		for (int i = num.length; i > 0; i--) {
			System.out.println(num[i]);
		}
	}
	
}
