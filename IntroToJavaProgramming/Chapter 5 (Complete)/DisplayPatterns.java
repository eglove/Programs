/* Write a method to display a pattern as follows:
 *               1
 *             2 1
 *           3 2 1
 * ...
 * n n-1 ... 3 2 1
 * The method header is
 * public static void displayPattern(int n)
 */
import java.util.Scanner;

public class DisplayPatterns {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		displayPattern(n);
	}
	
	public static void displayPattern(int n) {
		int temp = n;
		
		for(int i = 1; i <= n; i++) {
			// Print spaces until n - 1 (temp - 1)
			for(int j = 0; j <= temp; j++) {
				System.out.print("  ");
			}
			// Print numbers i--
			for(int m = i; m > 0; m--) {
				System.out.print(m + " ");
			}
			
			System.out.println();
			temp--;
		}
	}
}