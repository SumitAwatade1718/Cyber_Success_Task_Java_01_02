package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int count = countDigits(number);
		System.out.println("The number of digits in " + number + " is: " + count);
	   	sc.close();

	}
	private static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
	    
		return count;
	}

}
