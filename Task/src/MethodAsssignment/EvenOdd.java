/**
 * 
 */
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		String result = checkEvenOdd(num);
		System.out.println(num + " is " + result);

	}
	public static String checkEvenOdd(int num) {
		// TODO Auto-generated method stub
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
		
	}

}
