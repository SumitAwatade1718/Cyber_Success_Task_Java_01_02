package MethodAsssignment.Array;

/**
 * Author: Sumit Vilas Awatade
 * Date: 08-May-2026
 */
public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		int[] mergedArray = mergeArrays(arr1, arr2);
		System.out.print("Merged Array: ");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int arr3[] = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[index] = arr1[i];
			index++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[index] = arr2[i];
			index++;
		}
		return arr3;
	}

}
