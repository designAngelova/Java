
// 
//Input	Output	   
//(3) (22) (-18) (55) (44) (3) (21)	4	   
//(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)	10	   
//  ( 2 )  ( 33 ) (1) (4)   (  -1  ) 	3	   
//(102)(103)(0)(105)  (107)(1)	4	   
//(2) (2) (2) (2) (2)	1	 


import java.util.Scanner;
//Integer [] numbers = al.toArray(new Integer[0]) transforming arraylist to array
public class LongestOddEvenSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split("\\D+");
		int[] numbers = new int[input.length];
		int count=0;
		int max =0;
		for (int i = 0; i < input.length; i++) {
			if (!input[i].equals("")) {
				numbers[i] = Integer.parseInt(input[i]);

			}

		}
 for (int i = 0; i < numbers.length-1; i++) {
	 int a = numbers[i];
	 int b = numbers[i+1];
	if (((a%2 == 0 || a==0) && (b%2!=0 || b==0)) ||
			((a%2 != 0 || a== 0) && (b%2 ==0 || b==0))){
		count++;
		
	}
	else{
		count=1;
	}
	if (count > max) {
		count = max;
		
	}
	
}
 System.out.println(max);
	}

}
