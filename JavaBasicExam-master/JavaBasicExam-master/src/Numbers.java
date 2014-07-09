// 
//Input	Output		Input	Output		Input	Output	   
//5
//2 51 1 75 25	2|51==25|1
//25|1==2|51	 	7
//2 22 23 32 322 222 5	2|322==23|22
//23|22==2|322
//32|22==322|2
//32|222==322|22
//322|2==32|22
//322|22==32|222	 	3
//5 1 20	No	 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Numbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String [] split= new String[0];
		int [] numbers = new int[n];
		boolean flag =false;
		List <String>output = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			 numbers[i] = in.nextInt();
			 
		}
	
	
			for (int i = 0; i <numbers.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					for (int j2 = 0; j2 <numbers.length; j2++) {
						for (int k = 0; k < numbers.length; k++) {
							boolean check= numbers[i]!=numbers[j]&&numbers[j]!=numbers[j2]&&numbers[i]!=numbers[j2]&&numbers[i]!=numbers[k]&&numbers[j]!=numbers[k]&&numbers[j2]!=numbers[k];
							
							if (check&&(""+numbers[i]+numbers[j]).equals(""+numbers[j2]+numbers[k])) {
								//System.out.printf("%d|%d==%d|%d\n",numbers[i],numbers[j],numbers[j2],numbers[k]);
								output.add(numbers[i]+"|"+numbers[j]+"=="+numbers[j2]+"|"+numbers[k]);
								flag = true;
							}
							
							
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
//	private static int SumDigits(int n){
//		int sum =n%10;
//		if (n>9 && n<=99) {
//			sum +=n/10;
//		}
//		if (n>99 && n<=999) {
//			sum +=n/100;
//		}
//		else{
//			sum +=n/1000;
//		}
//		return sum;
//	}
	
