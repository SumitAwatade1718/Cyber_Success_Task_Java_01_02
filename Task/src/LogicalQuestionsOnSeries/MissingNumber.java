package LogicalQuestionsOnSeries;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5, 6, 7};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i + 1) {
//                System.out.println("Missing number = " + (i + 1));
//                break;
//            }
//        }
        int actualSum= 1+2+3+4+5+6+7;
        int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
        System.out.println("Missing number = " + (actualSum-sum));
        
	        
	}

}
