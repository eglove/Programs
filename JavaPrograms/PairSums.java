/* Given an array and a number k. Find number of pairs in the array having sum
 * equal to k.
 */
import java.util.Scanner;

public class PairSums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
	
		// User input of array size 10 and k
		System.out.print("Enter array of length 10: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		System.out.print("Enter k: ");
		int k = input.nextInt();
		
		int count = 0;
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list.length; j++) {
				if(list[i] + list[j] == k)
					System.out.println(list[i] + ", " + list[j]);
					count++;
			}
		}
		
		System.out.println(k + " sums.");
	}
}