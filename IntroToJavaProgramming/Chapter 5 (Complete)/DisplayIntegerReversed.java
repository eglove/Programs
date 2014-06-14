/* Write a method with the following header to displays an integer in reverse 
 * order:
 * public static void reverse(int number)
 * For example, reverse(3456) displays 6543. Write a test program that prompts 
 * the user to enter an integer and displays its reversal.
 */
import java.util.Scanner;

public class DisplayIntegerReversed {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to be reversed: ");
		int n = input.nextInt();
		
		reverse(n);
	}
	
	public static void reverse(int number) {
		int reverse = 0;
		
		while(number != 0) {
			reverse = reverse * 10 + number % 10; // Add 0 + last digit
			number = number / 10; // Cut of last digit from number
		}
		
		System.out.println("Reverse is " + reverse);
	}
}