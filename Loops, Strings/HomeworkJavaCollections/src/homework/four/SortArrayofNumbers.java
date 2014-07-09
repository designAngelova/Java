//Write a program to enter a number n and n integer numbers and sort and 
//print them. Keep the numbers in array of integers: int[].
package homework.four;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayofNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arrayInt = new int[n];
		for (int i = 0; i < n; i++) {
			arrayInt[i] = in.nextInt();
		}
		Arrays.sort(arrayInt);
		for (int numbers : arrayInt) {
			System.out.print(numbers + " ");
		
		}

	}

}
