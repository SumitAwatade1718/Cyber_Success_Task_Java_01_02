package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("what you want to check String Palindrome [1] or Number Palindrome[2]?");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter a string: ");
			String str = sc.next();
			if (isPalindrome(str)) {
				System.out.println(str + " is a palindrome.");
			} else {
				System.out.println(str + " is not a palindrome.");
			}
			break;
		case 2:
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			if (isPalindrome1(num)) {
				System.out.println(num + " is a palindrome.");
			} else {
				System.out.println(num + " is not a palindrome.");
			}
			break;
		default:
			System.out.println("Invalid choice. Please enter 1 for String Palindrome or 2 for Number Palindrome.");
		}
	}	
	
	private static boolean isPalindrome(String str) {
          int left = 0;
          int right = str.length() - 1;
          while (left < right) {
               if (str.charAt(left) != str.charAt(right)) {
				  return false;
		        }
		  left++;
		  right--;
		  }				
			return true;
	}
	private static boolean isPalindrome1(int num) {
		// TODO Auto-generated method stub
		int originalNum = num;
		int reversedNum = 0;
		while (num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}
		if (originalNum == reversedNum) {
			return true;
		}
		return false;
	}

}
