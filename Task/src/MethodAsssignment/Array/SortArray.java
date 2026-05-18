package MethodAsssignment.Array;

import java.lang.reflect.Array;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     		int[] arr = {16, 18,17,28, 20};
     		System.out.println("Array before sorting:");
     		printArray(arr);
     		sortArray(arr);
     		System.out.println("\nArray after sorting:");
     		printArray(arr);
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
