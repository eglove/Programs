import java.util.Scanner;
import java.util.Arrays;

public class CountOccurrenceNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
	
		// Ask user for integers between 1 and 100, input ends with 0
		System.out.print("Enter the integers between 1 and 100: ");
		int number = input.nextInt();
		int in = 0;
		while(number != 0) {
			array[in++] = number;
			number = input.nextInt();
		}
		
		// Sort array
		Arrays.sort(array);
		
		// Count occurrence of each integer and display
		for(int i = 1; i <= 100; i++) {
			int count = counts(array, i);
			
			printCount(i, count);
		}
	}
	
	public static int counts(int[] a, int n) {
		int count = 0;
		
		// Search for n inside a[]
		for(int i = 0; i < a.length; i++) {
			if(n == a[i]) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void printCount(int n, int count) {
		if(count == 1) {
			System.out.println(n + " occurs " + count + " time.");
		} else if(count > 1) {
			System.out.println(n + " occurs " + count + " times.");
		}
	}
}