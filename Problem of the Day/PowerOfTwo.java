/* Here's a simple one with some options for efficiency. Create a function that 
 * takes in a number and returns whether or not the number is a power of 2 or 
 * not.
 */
import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		checkPow(n);
	}
	
	public static void checkPow(int n) {
		int pow = 1;
		for(int i = 0; i < n; i++) {
			pow *= 2;
			if(pow == n) {
				System.out.println("true");
				break;
			} else if(pow > n) {
				System.out.println("false");
				break;
			}
		}
	}
}