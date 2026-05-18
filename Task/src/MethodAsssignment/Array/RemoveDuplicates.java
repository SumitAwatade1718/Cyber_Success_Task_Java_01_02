package MethodAsssignment.Array;
/**
 * Author: Sumit Vilas Awatade
 * Date: 08-May-2026
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		System.out.println("Array before removing duplicates:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] result = removeDuplicates(arr);
		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < result.length; i++) {
			if(result[i]!=0) {
				System.out.print(result[i] + " ");
			}
		}
	}

	private static int[] removeDuplicates(int[] arr) {

		int[] result = new int[arr.length];
		int j = 0;
		result[j] = arr[0];
		j++;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				result[j] = arr[i];
				j++;
			}
		}
		return result;
	}

}
