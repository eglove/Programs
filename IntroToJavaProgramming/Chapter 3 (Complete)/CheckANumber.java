/* Write a program that prompts the user to enter an integer and checks whether 
 * the number is divisible by both 5 and 6, or neither of them, or just checks 
 * whether the number is divisible by both 5 and 6, or neither of them, or just 
 * one of them. Here are some sample runs for inputs 10, 30 and 23.
 * 10 is divisible by 5 or 6, but not both.
 * 30 is divisible by both 5 and 6.
 * 23 is divisible by either 5 or 6.
 */
import java.util.Scanner;

public class CheckANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if(num % 5 == 0 && num % 6 == 0) {
			System.out.println(num + " is divisible by 5 and 6.");
		} else if(num % 5 == 0 ^ num % 6 == 0) {
			System.out.println(num + " is divisible by 5 or 6, but not both.");
		} else {
			System.out.println(num + " is not divisible by either 5 or 6.");
		}
	}
}