import java.util.Scanner;

public class AverageAnArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
	
		// Ask user to enter 10 double values
		System.out.print("Enter 10 double values: ");
		for(int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
			
		// Invoke average method
		double average = average(array);
			
		// Display the average value
		System.out.println(average);
	}
	
	public static int average(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
			sum += array[i];
			
		return sum / array.length;
	}
}