/**
 * 
 */
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number:");
         int num1 = sc.nextInt();
         System.out.println("Enter second number:");
         int num2 = sc.nextInt();
         int sum = add(num1, num2);
         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	}

	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	

}
