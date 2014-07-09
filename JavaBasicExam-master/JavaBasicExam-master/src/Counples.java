 
//Input		Input		Input	   
//3 4 2 3 4 2 1 12 2 3 4	 	5 10 5 10 10 5 5 10 5 10 10 5	 	10 20 10 10 10	   
//Output	 	Output	 	Output	   
//3 4 -> 30.00%
//4 2 -> 20.00%
//2 3 -> 20.00%
//2 1 -> 10.00%
//1 12 -> 10.00%
//12 2 -> 10.00%	 	5 10 -> 36.36%
//10 5 -> 36.36%
//10 10 -> 18.18%
//5 5 -> 9.09%	 	10 20 -> 25.00%
//20 10 -> 25.00%
//10 10 -> 50.00%	 


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Counples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] input = in.nextLine().split(" ");
		ArrayList<String> couples = new ArrayList<String>();
		ArrayList<String> output = new ArrayList<String>();
		int [] numbers = new int[input.length];
		
		for (int i = 0; i < input.length-1; i++) {
			String counple = input[i]+" "+ input[i+1];
			couples.add(counple);
		}
		LinkedHashMap<String, Integer> map =  new LinkedHashMap<String, Integer>();
		
		for (String cop : couples) {
			Integer count = map.get(cop);
			if (count == null) {
				count = 0; 
			}
			map.put(cop, count+1);
		}
		double length = couples.size();


		
		for (String copl : map.keySet()) {
			
			double count = (map.get(copl)/length)*100;
			System.out.printf("%s -> %.2f%%\n", copl, count);
		}		
	}
}
