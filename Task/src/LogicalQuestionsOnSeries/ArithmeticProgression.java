package LogicalQuestionsOnSeries;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a + d;
        }
        sc.close();
    }
}