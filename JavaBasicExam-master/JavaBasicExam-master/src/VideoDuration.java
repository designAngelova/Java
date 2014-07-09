import java.util.Scanner;


public class VideoDuration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String [] time;
		int hours = 0;
		int minutes = 0;
		int sumHours = 0 ;
		int sumMin =0;
		while(!input.equals("End")){
			time= input.split("\\:");
			hours=Integer.parseInt(time[0]);
			minutes=Integer.parseInt(time[1]);
			
		
		
			sumHours +=hours;
			sumMin += minutes;
			if(sumMin > 59){
				sumHours++;
				sumMin -= 60;
			}
			input=in.nextLine();
		}
			System.out.printf("%1s:%02d", sumHours, sumMin);
		}
	}


