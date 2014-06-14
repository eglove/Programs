/* Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome if 
 * its reverse is the same as itself. Write a test program that prompts the user 
 * to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		// Get reverse and check if palindrome
		int rev = reverse(num);
		System.out.println("Reverse of " + num + " is " + rev);
		
		if(isPalindrome(num)) {
			System.out.println(num + " is a palindrome.");
		} else {
			System.out.println(num + " is not a palindrome.");
		}	
	}
	
	public static boolean isPalindrome(int n) {
	
			if(n == reverse(n)) {
				return true;
			}
			return false;
	}
	
	public static int reverse(int n) {
	
		int reverse = 0;
	
		while(n != 0) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		
		return reverse;
	}
}