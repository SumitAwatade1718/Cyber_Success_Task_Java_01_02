package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class ReverseSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
	}

}
