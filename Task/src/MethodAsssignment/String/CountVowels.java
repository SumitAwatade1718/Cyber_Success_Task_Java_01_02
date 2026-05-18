package MethodAsssignment.String;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sumit Vilas Awatade";
		int vowelCount = countVowels(str);
		System.out.println("The number of vowels in the string is: " + vowelCount);
	}
	
	private static int countVowels(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		return count;
	}

}
