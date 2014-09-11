// Find n Fibonacci number using Strassen's Method
import java.util.Scanner;

public class FibonacciStrassen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n to find Fibonacci number: ");
		int n = input.nextInt();
		
		strassen(n);
	}
	
	public static void strassen(int n) {
		int[] baseMatrix = new int[]{1,1,1,0};
		int[] answer = new int[]{1,1,1,0};
		
		// Initialize a-h to fill two matrices
		int a = baseMatrix[0];
		int b = baseMatrix[1];
		int c = baseMatrix[2];
		int d = baseMatrix[3];
		int e = answer[0];
		int f = answer[1]; 
		int g = answer[2];
		int h = answer[3];
		
		// Multiply baseMatrix by itself using Strassen n times and use
		// 2nd element in array to get Fibonacci number.
		for(int i = 0; i < n; i++) {

			// Reset p's for every loop to account for changing second matrix
			int p1 = a * (f - h);
			int p2 = (a + b) * h;
			int p3 = (c + d) * e;
			int p4 = d * (g - e);
			int p5 = (a + d) * (e + h);
			int p6 = (b - d) * (g + h);
			int p7 = (a - c) * (e + f);
		
			// Multiply two matrices (with only 7 multiplications!)
			answer[0] = p5 + p4 - p2 + p6;
			answer[1] = p1 + p2;
			answer[2] = p3 + p4;
			answer[3] = p1 + p5 - p3 - p7;
			
			// Reset e-h for new second matrix (caclulated above)
			e = answer[0];
			f = answer[1]; 
			g = answer[2];
			h = answer[3];
		}
		
		// Print matrix
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
		// Print nth Fibonacci number
		System.out.println("\nFibonacci number: " + answer[1]);
	}
}