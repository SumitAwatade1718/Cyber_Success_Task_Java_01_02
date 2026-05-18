package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		int num = 0;

		for (int i = 1; i <= n; i++) {
		    num = num * 10 + 1;
		    System.out.print(num + " ");
		}
		sc.close();
	}

}
