//
// 
//[3 x 3] [3 x 2] [4 x 3] [1 x 4] [5 x 3] [3 x 1]	31	4*3 + 1*4 + 5*3 = 31	   
//  [12x7][3x5][10x12]  [4x3][1x8]  	219	12*7 + 3*5 + 10*12 = 219	   
//[2x2][3x3][4x4][5x5][6x6][7x7][8x8][9x9][10x10]	245	8*8 + 9*9 + 10*10 = 245	   
// [   300  x  200 ]  [50x  50][ 30 x  20 ]	63100	300*200 + 50*50 + 30*20 = 63100	 

import java.util.ArrayList;

import java.util.Scanner;




public class Largest3Rectangles {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		String [] input = in.nextLine().split("\\D+");
		Integer sum =0;
		int tmp = 0;
		int max = 0;
		Integer [] numbers = new Integer[input.length/2];
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i =1; i < input.length; i+=2) {
			if (!input[i].equals("")) {
				int a = Integer.parseInt(input[i]);
				int b = Integer.parseInt(input[i+1]);
				array.add(a*b);
			}
		}
	
			
			
			numbers = array.toArray(new Integer[0]);
			for (int i = 0; i < numbers.length-2; i++) {
				tmp = numbers[i]+ numbers[i+1]+numbers[i+2];
				if (tmp > max) {
					max= tmp;
					
				}
			}
			
			System.out.println(max);
		}
		
		}

	


