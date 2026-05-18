package MethodAsssignment.Array;
/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 18,17,28, 20};
		int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
        int smallest = findSmallest(arr);
        System.out.println("The smallest element in the array is: " + smallest);
	}

	private static int findSmallest(int[] arr) {
			int smallest = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < smallest) {
					smallest = arr[i];
				}
			}
		return smallest;
	}

	private static int findLargest(int[] arr) {
			int largest = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > largest) {
					largest = arr[i];
				}
			}
		    return largest;
	}

}