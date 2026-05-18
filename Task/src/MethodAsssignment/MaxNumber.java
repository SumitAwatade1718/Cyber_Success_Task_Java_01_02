/**
 * 
 */
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class MaxNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number:");
       int num1 = sc.nextInt();
       System.out.println("Enter second number:");
       int num2 = sc.nextInt();
       int max = findMax(num1, num2);
       System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
	}

	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static int findMax(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		
	}

}
