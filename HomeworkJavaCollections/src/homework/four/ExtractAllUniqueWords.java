//At the first line at the console you are given a piece of text. Extract all words from
//it and print them in alphabetical order. Consider each non-letter character as word separator.
//Take the repeating words only once. Ignore the character casing. Print the result 
//words in a single line, separated by spaces. 
package homework.four;


import java.util.Scanner;

import java.util.TreeSet;

public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine().toLowerCase();
		//ignore nonleters
		String[] txt = text.split("\\W+");
		TreeSet<String> set = new TreeSet<String>();
		
		for (String words : txt) {
			set.add(words);
		}
		
		for (String element : set) {
			System.out.print(element + " ");
		}
		
		
	}
}


