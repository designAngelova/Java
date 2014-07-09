//Write a program that enters an array of strings and finds in it all 
//sequences of equal elements. The input strings are given as a single line, separated by a space
package homework.four;

import java.util.Scanner;

public class SequencesofEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] elements = input.split(" ");
		System.out.print(elements[0]);
		for (int i = 1; i < elements.length; i++) {
			if (elements[i].equals(elements[i - 1])) {
				System.out.print(" " + elements[i]);

			} else {
				System.out.println();
				System.out.print(elements[i]);
			}
			
		}

	}

}
