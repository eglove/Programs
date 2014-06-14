import java.util.Scanner;

public class IndexOfSmallestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		// User enters 10 numbers
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
		
		// Get index of smallest value
		int index = indexOfSmallestElement(array);
		
		// Display index
		System.out.println("The index of the smallest element is " + index);
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double smallNum = array[0];
		int index = 0;
		
		for(int i = 0; i < array.length; i++)
			if(array[i] < smallNum) {
				smallNum = array[i];
				index = i;
			}
			
		return index;
	}
}