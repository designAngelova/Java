//Write a program to find all increasing sequences inside an array of integers.
//The integers are given in a single line, separated by a space. Print the sequences
//in the order of their appearance in the input array, each at a single line. Separate
//the sequence elements by a space. Find also the longest increasing sequence and print
//it at the last line. If several sequences have the same longest length, print the leftmost of them.

package homework.four;

import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] array = input.split(" ");
		int[] numbers = new int[array.length];
		int counter = 1;
		int maxCounter = 1;
		int position = 0;

		// transform string array on int array
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}

		// printig increasing sequence
		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(" " + numbers[i]);
				counter++;
			}

			else {
				counter = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (maxCounter < counter) {
				maxCounter = counter;
				position = i;
			}
		}
		// printing longest increasing sequence 
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[position - counter + 1 + j] + " ");
		}
		System.out.println(numbers[position]);
		
	}
}
