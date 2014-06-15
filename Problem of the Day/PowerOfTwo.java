/* Here's a simple one with some options for efficiency. Create a function that 
 * takes in a number and returns whether or not the number is a power of 2 or 
 * not.
 */
import java.util.*;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		System.out.println(checkPow(n));
	}
	
	public static boolean checkPow(int n) {
		double pow = Math.log(n) / Math.log(2);
		System.out.println(pow);
		if(pow == Math.floor(pow)) {
			return true;
		} else {
			return false;
		}
	}
}