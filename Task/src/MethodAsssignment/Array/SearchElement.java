package MethodAsssignment.Array;

import java.util.Scanner;
/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search: ");
		int element = sc.nextInt();
		int index = searchElement(arr, element);
		if (index == -1) {
			System.out.println("Element " + element + " is not found in the array.");
		} else {
		System.out.println("Element " + element + " is found at index: " + index);
		}
	   	sc.close();
	}
	
	private static int searchElement(int[] arr, int element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1; 
	}

}
