import java.util.Scanner;

public class AddTwoMatrices {
	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = new double[3][3];
		
		// Enter 3x3 matrix 1
		System.out.print("Enter matrix1: ");
		matrix1 = readMatrix();
		
		// Enter 3x3 matrix 2
		System.out.print("Enter matrix2: ");
		matrix2 = readMatrix();
		
		// Find sum of two matrices
		matrix3 = addMatrix(matrix1, matrix2);
		
		// Display 3 matrices (1 + 2 = 3)
		display(matrix1, matrix2, matrix3);
	}
	
	public static double[][] readMatrix() {
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][3];
		
		for(int row = 0; row < m.length; row++) {
			for(int column = 0; column < m[row].length; column++) {
				m[row][column] = input.nextDouble();
			}
		}
		
		return m;
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
	
		// Add a + b
		for(int row = 0; row < a.length; row++)
			for(int column = 0; column < a[row].length; column++)
				c[row][column] = a[row][column] + b[row][column];
				
		return c;
	}
	
	public static void display(double[][] a, double[][] b, double[][] c) {
		// Print a row 0, b row 0, c row 0
		print(a, 0); System.out.print("   "); print(b, 0);
		System.out.print("   "); print(c, 0);
		System.out.println();
		
		// Print a row 1, +, b row 1, =, c row 1
		print(a, 1); System.out.print("+  "); print(b, 1);
		System.out.print("=  "); print(c, 1);
		System.out.println();
		
		// Print a row 2, b row 2, c row 2
		print(a, 2); System.out.print("   "); print(b, 2); 
		System.out.print("   "); print(c, 2);
	}
	
	public static void print(double[][] m, int row) {
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[row][i] + " ");
		}
	}
}