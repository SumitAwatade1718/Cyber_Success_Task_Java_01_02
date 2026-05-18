
package MethodAsssignment.String;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       		String str = "Sumit Vilas Awatade";
       				String reversedStr = reverseString(str);
       				System.out.println("Original String: " + str);
       				System.out.println("Reversed String: " + reversedStr);
	}
	
    
	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		return reversedStr;
	}

}
