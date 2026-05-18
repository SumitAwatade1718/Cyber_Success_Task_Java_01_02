package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {

            int num = i;  
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;      
                rev = rev * 10 + digit;   
                num = num / 10;           
            }
            if (rev == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
	}

}
