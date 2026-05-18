package MethodAsssignment.String;

/**
 * Author: Sumit Vilas Awatade
 * Date: 08-May-2026
 */
public class StringProgram {

	public static void main(String[] args) {

		// 26) First Non-Repeating Character
		String str = "Sumit Vilas Awatade";

		char ch = firstNonRepeatingCharacter(str);

		System.out.println("The first non-repeating character is: "+ ch);

		// 27) Count Vowels, Consonants, Digits
		String str1 = "Sumit1718 Vilas Awatade";
		countVowelsConsonantsDigits(str1);
		// 28) Remove Duplicate Characters
		String str2 ="AaBbC";
		removeDuplicateCharacters(str2);
	}

	// 27	
	private static void countVowelsConsonantsDigits(String str1) {
		int vowelCount = 0;
		int consonantCount = 0;
		int digitCount = 0;
		for (int i = 0;i < str1.length(); i++) {
			char ch = str1.charAt(i);
			// Vowel
			if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
				vowelCount++;
			}
			// Consonant
			else if (Character.isLetter(ch)) {
				consonantCount++;
			}
			// Digit
			else if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		System.out.println( "Total Vowels = " + vowelCount);
		System.out.println(" Total Consonants = " + consonantCount);
		System.out.println(" Total Digits = "+ digitCount);
	}
	// 26
	private static char firstNonRepeatingCharacter(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isRepeating = false;
			for (int j = 0;j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					isRepeating = true;
					break;
				}
			}
			if (!isRepeating) {
				return ch;
			}
		}
		return 0;
	}

	// 28
	private static void removeDuplicateCharacters(String str) {

		String result = "";
		str = str.toLowerCase();
		for (int i = 0;i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isRepeating = false;
			for (int j = 0;j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					isRepeating = true;
					break;
				}
			}
			if (!isRepeating) {
				result =result + ch;
		}
		
	}
		System.out.println(
				"String After Removing Duplicates = " + result);
}
}