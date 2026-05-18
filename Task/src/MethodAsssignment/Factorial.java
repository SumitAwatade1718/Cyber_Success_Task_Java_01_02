/**
 * 
 */
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(num < 0){
			System.out.println("Factorial is not defined for negative numbers.");
			return;
			
		}
		long result = calculateFactorial(num);
		System.out.println("Factorial of " + num + " is " + result);
	}
	
	private static long calculateFactorial(int num) {
		
		 if(num == 0 || num == 1) {
			return 1;
		}else{
			long factorial = 1;
			for(int i = 2; i <= num; i++) {
				factorial =factorial * i;
			}
			return factorial;
		}
    }
}
