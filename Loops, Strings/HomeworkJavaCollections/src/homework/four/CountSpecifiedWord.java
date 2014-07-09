//Write a program to find how many times a word appears in given text. The text is
//given at the first input line. The target word is given at the second input line.
//The output is an integer number. Please ignore the character casing. Consider that
//any non-letter character is a word separator.
package homework.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input =  in.nextLine().toUpperCase();;
		String word = in.nextLine().toUpperCase();
		int count = 0;
		
		
		String noLetter = "\\s*"+word+"\\s+" ;
		Pattern readText = Pattern.compile(noLetter);
		Matcher matcher = readText.matcher(input);
		while (matcher.find()) {
			matcher.group();
			count++;
		}
		System.out.println(count);
	
 	}




	}


