/* Your mission, should you choose to accept it, is to create a program to
 * return whether a number is a palindromic number or not. To make things
 * slightly more interesting you may not use a string or array in your solution.
 */
import java.util.Scanner;

public class PalindromicNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		input.close();
		
		// Check if antiNum is palindrome
		boolean isPalindrome = isPalindrome(num);
		
		if(isPalindrome)
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + " is not a palindrome.");
	}
	
	public static int reverse(int num) {
		int rev = 0;
		
		while(num != 0) {
			rev *= 10; // Put 0 at end of rev
			rev = rev + (num % 10); // Add last digit of num
			num = num / 10; // Use int arithmetric to cut off last digit
		} return rev;
	}
	
	public static boolean isPalindrome(int num) {
		// Get reverse of number
		int antiNum = reverse(num);
		
		if(antiNum == num)
			return true;
		else
			return false;
	}
}