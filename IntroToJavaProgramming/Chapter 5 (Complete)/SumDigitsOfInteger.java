/* Write a method that computes the sum of the digits in an integer. 
 * Use the following method header:
 * public static int sumDigits(long n)
 */
import java.util.Scanner;
 
public class SumDigitsOfInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		System.out.println("The sum of the digits is " + sumDigits(num) + ".");
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		int length = String.valueOf(n).length();
		
		for(int i = 0; i < length; i++) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}