package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int num = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");

            if (i % 2 == 0)
            	 num = num + 1;
            else
            	num = num * 3;
        }
        sc.close();
	}

}
