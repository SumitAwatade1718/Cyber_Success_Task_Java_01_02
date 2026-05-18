package MethodAsssignment;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num=12345;
		int reversedNum = reverseNumber(num);
		System.out.println("Original number: " + num);
		System.out.println("Reversed number: " + reversedNum);
	}
	private static int reverseNumber(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		return reversed;
	}

}
