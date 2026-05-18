package MethodAsssignment;

import java.util.Scanner;

/**
 * Author: Sumit Vilas Awatade
 * Date: 06-May-2026
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
     	System.out.println("Enter the number to check if it is prime or not:");
     	int num = sc.nextInt();
     	if(isPrime(num)) {
	 		System.out.println(num + " is a prime number.");
	 	} else {
	 		System.out.println(num + " is not a prime number.");
	 	}
     		sc.close();	
	}

	private static boolean isPrime(int num) {

	    if (num <= 1) {
	        return false;
	    }
	    for (int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false; 
	        }
	    }
	    return true;
	}

}
