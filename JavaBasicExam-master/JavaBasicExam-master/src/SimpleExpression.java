import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class SimpleExpression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String [] splited = input.split("\\s*");
		String coppy = "";
		for (int i = 0; i < splited.length; i++) {
			coppy += splited[i];
		}
		String[] digits = coppy.split("[+-]+");
		String [] operators = coppy.split("[0123456789.]+");
		BigDecimal output = new BigDecimal(digits[0]);
		for (int i = 0; i < operators.length-1; i++) {
			if (operators[i+1].equals("+")) {
				output = output.add(new BigDecimal(digits[i+1]));
			}
			else{
				output = output.subtract(new BigDecimal(digits[i+1]));
			}
		}
	System.out.println(output);
}
}