import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PythagoreanNumbers {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = Integer.parseInt(in.nextLine());
	int [] numbers = new int[n];
	List<String> output = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		numbers[i] =Integer.parseInt(in.nextLine());
	}
	for (int i = 0; i < numbers.length; i++) {
		for (int j = 0; j < numbers.length; j++) {
			for (int k = 0; k < numbers.length; k++) {
				boolean isValid= numbers[i]<= numbers[j];
				if (isValid && (numbers[i]* numbers[i]+ numbers[j]* numbers[j]) == numbers[k]*numbers[k] ) {
					output.add(numbers[i]+"*"+ numbers[i]+" + "+ numbers[j]+"*" +numbers[j]+" = " + numbers[k]+"*"+ numbers[k]);
				}
			}
		}
	}
	for (String string : output) {
		System.out.println(string);
	}
	if (output.isEmpty()) {
		System.out.println("No");
	}
	}

}
