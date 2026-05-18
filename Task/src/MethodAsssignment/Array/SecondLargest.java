package MethodAsssignment.Array;

/**
 * Author: Sumit Vilas Awatade
 * Date: 08-May-2026
 */
public class SecondLargest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 10, 15, 20, 25};
		int secondLargest = findSecondLargest(arr);
		System.out.println("The second largest element in the array is: " + secondLargest);
		

	}

	private static int findSecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		
		int largest=arr[0];
		int secondLargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}

}
