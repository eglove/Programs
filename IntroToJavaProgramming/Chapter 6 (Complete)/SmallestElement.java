// Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
// The minimum number is: 1.5
import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
	
		// User enters 10 numbers
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
			
		// Get minimum value
		double min = min(array);
			
		// Display minimum value
		System.out.println("The minimum number is: " + min);
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
		}
		
		return min;
	}
}