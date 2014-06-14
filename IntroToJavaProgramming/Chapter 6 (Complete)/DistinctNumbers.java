import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		// Ask user to 10 numbers, accept only distinct numbers
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			
			// Check if array[i] is distinct, if not reset to 0
			if(!distinct(array, array[i]))
				array[i] = 0;
		}
		
		// Print results
		printA(array);
	}
	
	public static boolean distinct(int[] a, int n) {
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(n == a[i])
				count++;
		}
		
		if(count > 1)
			return false;
		
		return true;
	}
	
	public static void printA(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != 0)
				System.out.print(a[i] + " ");
		}
	}
}