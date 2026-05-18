package LogicalQuestionsOnSeries;
import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }

        sc.close();
    }
}