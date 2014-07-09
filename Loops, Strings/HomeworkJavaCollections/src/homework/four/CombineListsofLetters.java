//Write a program that reads two lists of letters l1 and l2 and combines them: appends
//all letters c from l2 to the end of l1, but only when c does not appear in l1. Print
//the obtained combined list. All lists are given as sequence of letters separated by a 
//single space, each at a separate line. Use ArrayList<Character> of chars to keep the 
//input and output lists. 
package homework.four;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class CombineListsofLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();
		String secondtLine = in.nextLine();
		ArrayList<Character> firstArr = new ArrayList<Character>();
		ArrayList<Character> secondArr = new ArrayList<Character>();
		ArrayList<Character> result = new ArrayList<Character>();
	 
		// create ArrayList of chars from string
		for (char symbol : firstLine.toCharArray()) {
			firstArr.add(symbol);
		}
		for (char symbol : secondtLine.toCharArray()) {
			secondArr.add(symbol);
		}
		result.addAll(firstArr);
		for (int i = 0; i < secondArr.size(); i++) {
			
				if (firstArr.contains(secondArr.get(i))) {
					continue;
				} else {
					result.add(' ');
					result.add(secondArr.get(i));
					result.add(' ');
				}
			}

		
		for (Character symbs : result) {
			System.out.print(symbs);
		}
	}

}
