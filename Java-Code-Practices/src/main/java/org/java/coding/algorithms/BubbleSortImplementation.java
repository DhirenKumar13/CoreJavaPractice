package org.java.coding.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortImplementation {

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
		bubbleSort(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}

	private static void bubbleSort(Integer[] arr) {
		int size = arr.length;
		for(int outer = 0; outer < size; outer++) {
			for(int inner = 0; inner < size - outer - 1; inner++) {
				if(arr[inner] > arr[inner+1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
	
}
