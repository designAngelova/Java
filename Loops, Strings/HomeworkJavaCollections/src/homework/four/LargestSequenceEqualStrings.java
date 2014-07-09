//Write a program that enters an array of strings and finds in it the 
//largest sequence of equal elements. If several sequences have the same
//longest length, print the leftmost of them. The input strings are given 
//as a single line, separated by a space
package homework.four;
import java.util.Scanner;
public class LargestSequenceEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String [] array = input.split(" ");
		int counter = 1;
		
		int position = 0;
		int maxCounter = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i].equals(array[i-1])) {
				counter++;
			}
				else {
					counter = 1;
				}
				if (maxCounter < counter) {
					maxCounter = counter;
					position = i;
				}
				
			}
			for (int j = 0; j < counter-1; j++) {
				System.out.print(array[position] + " ");
			}
			System.out.println(array[position]);
			
		}
		
	}


