import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ThreeLargestNumbers {

        public static void main(String[] args) {
                Locale.setDefault(Locale.ROOT);
               
                Scanner in = new Scanner(System.in);
                int n = Integer.parseInt(in.nextLine());
               
                BigDecimal[] numbers = new BigDecimal[n];
                for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = new BigDecimal(in.nextLine());
                }
               
                Arrays.sort(numbers);
               
               
                for (int i = numbers.length-1, count = 3; i >= 0 && count >0; i--, count--) {
                        System.out.println(numbers[i].toPlainString());
                }
        }
}
