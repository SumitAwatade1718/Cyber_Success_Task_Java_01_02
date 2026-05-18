package MethodAsssignment.String;

/**
 * Author: Sumit Vilas Awatade
 * Date: 08-May-2026
 */
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sumit Vilas Awatade";
		int count = countWords(str);
		System.out.println("The number of words in the string is: " + count);

	}

	private static int countWords(String str) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			return 0;
		}
		int count = 1; 
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

}
