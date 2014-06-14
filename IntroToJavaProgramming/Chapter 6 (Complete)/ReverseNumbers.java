import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		// Ask user to input 10 integers
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		
		// Reverse sort array
		reverse(array);
		
		// Display array
		System.out.println(Arrays.toString(array));
	}
	
	public static void reverse(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
}