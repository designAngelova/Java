//Write a program to find how many times given string appears in given text as substring. The text is given at 
//the first input line. The search string is given at the second input line. The output is an integer number.
//Please ignore the character casing
package homework.four;

import java.util.Scanner;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toUpperCase();
		String word = in.nextLine().toUpperCase();

		System.out.println(IfContains(input, word));
		in.close();

	}

	private static int IfContains(String str, String words) {
		int count = 0;
		int idx = 0;

		while ((idx = str.indexOf(words, idx)) != -1) {
			idx++;
			count++;
		}

		return count;
	}

}
