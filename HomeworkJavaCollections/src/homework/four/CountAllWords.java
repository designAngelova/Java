//Write a program to count the number of words in given sentence. Use any non-letter character as word separator
package homework.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input =  in.nextLine();
		int count = 0;
		
		String noLetter = "[a-zA-Z]+([ ])*";
		Pattern readText = Pattern.compile(noLetter);
		Matcher matcher = readText.matcher(input);
		while (matcher.find()) {
			matcher.group();
			count++;
		}
		System.out.println(count);
		
 	}

}
