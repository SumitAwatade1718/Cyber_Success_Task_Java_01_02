
package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		System.out.print("Fibonacci Series: ");
	    fibonacci(n);
	    		sc.close();
	}
	
	private static void fibonacci(int n) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a +" ");
			int next = a + b;
			a = b;
			b = next;
		}
		
	}


}
