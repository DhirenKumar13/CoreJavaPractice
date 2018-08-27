package org.java.coding.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortImplementation {

	int[] array = {};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int []arr = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter "+(i+1)+" element ...");
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		divideAndMerge(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}

	public static void merge(int[] left, int[] right, int[] array) {
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (left[i] < right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < leftSize) {
			array[k] = left[i]; k++; i++;
		}
		while (j < rightSize) {
			array[k] = right[j]; k++; j++;
		}
	}

	public static void divideAndMerge(int[] array) {
		int size = array.length;
		int mid = size / 2;
		if (size < 2) {
			
		}
		int left[] = new int[mid];
		int right[] = new int[size - mid];
		for (int i = 0; i < mid - 1; i++) {
			left[i] = array[i];
		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = array[i];
		}
		divideAndMerge(left);
		divideAndMerge(right);
		merge(left, right, array);
	}
}
