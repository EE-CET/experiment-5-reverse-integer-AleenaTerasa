
import java.util.Scanner;

public class ReverseInteger { 
        // TODO: Read an integer and print its reverse
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n =sc.nextInt();
            int reverse = 0;

            while (n != 0) {
                int digit = n % 10; // Get the last digit
                reverse = reverse * 10 + digit; // Append the digit to the reverse
                n /= 10; // Remove the last digit
            }

            System.out.println("Reversed integer: " + reverse);
        }


}
