package org.java.coding.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortImplementation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		Integer []arr = new Integer[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter "+(i+1)+" element ...");
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}
	
	public static void selectionSort(Integer[] arr) {
		
		int size = arr.length;
		
		for(int start = 0; start <= size-2; start++) {
			int startIndex = start;
			
			for(int begin = start+1 ; begin < size; begin++) {
				if(arr[begin] < arr[startIndex]) {
					startIndex = begin;
				}
			}
			
			int tempStore = arr[start];
			arr[start] = arr[startIndex];
			arr[startIndex] = tempStore;
			
		}
	}

}
