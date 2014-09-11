/* Given a number N. We can divide the number into N/2, N/3 and N/4 at a time
 * rounding all these to integer value. Now you can repeat the above procedure
 * newly generated numbers. Get the maximum number that you can generate from a
 * given number. Example: Given Number = 12
 * 12 -> 6 + 4 + 3
 * 6 -> 3 + 2 + 1
 * 4 -> 2 + 1 + 1
 * 3 -> 1 + 1 + 0
 * So max number generated = 13 (6+4+3)
*/
import java.util.Scanner;

public class MaxGenerated {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] sums = new int[4];
		int[] division = new int[3];
		
		// User input
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		// Get divisions from n
		division = first(n);
		sums[0] = division[0] + division[1] + division[2];
		
		// Sum divisions of everything else
		for(int i = 1; i < sums.length; i++) {
			sums[i] = division[i-1];
		}
		
		// Find max and print out
		int max = 0;
		for(int i = 0; i < sums.length; i++) {
			if(max < sums[i])
				max = sums[i];
		}
		System.out.println("Max number generated: " + max);
	}
	
	public static int[] first(int n) {
		int[] list = new int[3];
		list[0] = n/2;
		list[1] = n/3;
		list[2] = n/4;
		return list;
	}
	
	public static int divideAndSum(int n) {
		int a = n/2, b = n/3, c = n/4;
		return a+b+c;
	}
}