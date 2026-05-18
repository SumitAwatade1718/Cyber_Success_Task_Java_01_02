package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class PowerSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Base: ");
        int base = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * base;
            System.out.print(result + " ");
        }
        sc.close();
	}

}
