import java.util.Scanner;

public class SumMajorDiagonals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[4][4];
	
		// Read a 4-by-4 matrix
		System.out.println("Enter a 4-by-4 matrix: ");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		
		// Get sum of elements on major diagonal
		double sum = sumMajorDiagonal(matrix);
		
		// Display sum
		System.out.println("Sum of the elements in the major diagonal is " 
			+ sum);
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		
		return sum;
	}
}