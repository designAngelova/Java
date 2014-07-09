package problem8;
import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayStrings {
	private static Scanner in;

	public static void main(String[] arg) {
		in = new Scanner(System.in);
		int range = in.nextInt();
		ArrayList<String> allNames = new ArrayList<String>();
		for (int i = 0; i <= range - 1; i++) {
			String name = in.next();
			allNames.add(name);
		}
		allNames.sort(null);
		System.out.println(allNames);
	}
}
