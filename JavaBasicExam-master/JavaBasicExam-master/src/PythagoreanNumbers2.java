import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanNumbers2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int [] numbers = new int[n];
		ArrayList<String> output = new ArrayList<String>();
	
		// reading array of integer from console 
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			numbers[i] = num;
		}
		for (int a = 0; a < numbers.length; a++) {
			for (int b = 0; b < numbers.length; b++) {
				for (int c = 0; c < numbers.length; c++) {
					if (((numbers[a]*numbers[a]+numbers[b]*numbers[b]) == numbers[c]*numbers[c]) && numbers[a]<=numbers[b]) {
						output.add(numbers[a]+"*"+numbers[a]+" + "+ numbers[b]+"*"+numbers[b] + " = "+ numbers[c]+"*"+numbers[c]);
						
					}
				}
			
			}
		
		}
		if (output.isEmpty()) {
			System.out.println("No");
		}
		for (String string : output) {
			System.out.println(string);
		
		
		}
	}
}