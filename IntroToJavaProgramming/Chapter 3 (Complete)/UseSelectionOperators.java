/* Write a program that prompts the user to enter an integer and determines 
 * whether it is divisible by 5 and 6, whether it is divisible by 6 or 6, and 
 * whether it is divisible by 5 or 6, but not both. Here is a sample run of this 
 * program:
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * If 10 divisible by 5 or 6, but not both? true
 */
import java.util.Scanner;

public class UseSelectionOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean check;
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		check = (num % 5 == 0 && num % 6 == 0);
		System.out.println("Is " + num + " divisible by 5 and 6? " + check);
		
		check = (num % 5 == 0 || num % 6 == 0);
		System.out.println("Is " + num + " divisible by 5 or 6? " + check);
		
		check = (num % 5 == 0 ^ num % 6 == 0);
		System.out.println("Is " + num + " divisible by 6 or 6, but not both? " 
			+ check);
	}
}