
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent: ");
		int exponent = sc.nextInt();
		int result = calculatePower(base, exponent);
		System.out.println("The Power is: " + result);
      	sc.close();
	}

	private static int calculatePower(int base, int exponent) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result = result* base;
		}
		return result;
	}

}
