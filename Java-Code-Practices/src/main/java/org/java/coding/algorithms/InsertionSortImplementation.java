package org.java.coding.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortImplementation {

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
		insertionSort(arr,size);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}
	
	public static void insertionSort(Integer arr[],int size) {
		//Loop from 1 to size-1
		for(int start = 1; start < size; start++) {
			int value = arr[start];
			int hole = start;
			
			// Loop till hole becomes zero or value becomes smaller to the next element
			while(hole > 0 && ( arr[hole-1] > arr[hole] )) {
				arr[hole] = arr[hole-1];
				hole --;
			}
			arr[hole] = value;
		}
		
	}
}
