package MethodAsssignment.String;

/**
 * Author: Sumit Vilas Awatade
 * Date: 07-May-2026
 */
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sumit Vilas Awatade";
		String strWithoutSpaces = removeSpaces(str);
        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + strWithoutSpaces);
	}

	private static String removeSpaces(String str) {
		// TODO Auto-generated method stub
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				str1= str1+ch;
			}
		}
		return str1;
	}
}
