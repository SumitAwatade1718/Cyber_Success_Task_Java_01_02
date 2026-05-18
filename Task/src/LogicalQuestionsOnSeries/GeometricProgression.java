package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		int a = 2, r = 3;
		

		for (int i = 0; i < n; i++) {
		    System.out.print(a + " ");
		    a = a * r;
		}
		sc.close();
	}

}
