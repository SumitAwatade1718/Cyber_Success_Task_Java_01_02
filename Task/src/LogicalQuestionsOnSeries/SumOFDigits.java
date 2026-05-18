package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10; 
	            sum = sum + digit;    
	            num = num / 10;       
	        }

	        System.out.println("Sum of digits = " + sum);
	        sc.close();
	}

}
