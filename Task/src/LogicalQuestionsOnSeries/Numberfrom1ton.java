package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class Numberfrom1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
			 System.out.print(i + " ");
		 }	
		 sc.close();
         
	}
	

}
