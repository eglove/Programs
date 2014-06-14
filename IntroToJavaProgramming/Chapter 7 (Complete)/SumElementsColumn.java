import java.util.Scanner;

public class SumElementsColumn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][4];
		
		// Read 3-by-4 matrix
		System.out.println("Enter a 3-by-4 matrix: ");
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[0].length; column++) {
				array[row][column] = input.nextDouble();
			}
		}
		
		// Display sum of each column
		for(int column = 0; column < array[0].length; column++) {
			System.out.println("Sum of the elements at column " + column +
				" is " + sumColumn(array, column));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		
		for(int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		
		return sum;
	}
}