package MethodAsssignment.String;

import java.util.Arrays;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		char[] ch = str1.toCharArray();
		char[] ch1 = str2.toCharArray();
		int isAnagram = areAnagrams(ch, ch1);
		if (isAnagram == 1) {
			System.out.println("The strings are anagrams.");
		}else {
			System.out.println("The strings are not anagrams.");
		}

	}

	private static int areAnagrams(char[] ch, char[] ch1) {
		// TODO Auto-generated method stub
		if (ch.length != ch1.length) {
			System.out.println("The strings are not anagrams.");
			return 0;
		}
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ch1[i]) {
				System.out.println("The strings are not anagrams.");
				return 0;
			}
		}
		return 1;
		
	}



}
