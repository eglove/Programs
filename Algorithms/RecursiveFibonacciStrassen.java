// Find n Fibonacci number using Strassen's Method
import java.util.Scanner;

public class RecursiveFibonacciStrassen {
	public static void main(String[] args) {
	
		// User input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n to find Fibonacci number: ");
		int n = input.nextInt();
		
		// 5 length for recursive function returning n-1
		int[] finalResult = new int[]{n,1,1,1,0};
		finalResult = strassen(finalResult);
		
		// Print matrix (start at one to skip in in array)
		for(int i = 1; i < finalResult.length; i++) {
			System.out.print(finalResult[i] + " ");
		}
		
		// Print nth Fibonacci number (2 is second element in matrix)
		System.out.println("\nFibonacci number: " + finalResult[2]);
	}
	
	public static int[] strassen(int[] list) {
		if(list[0] == 0)
			return list;
		else {
			// a-d is first matrix, stay constant matrix is multiplied by itself
			int a = 1, b = 1, c = 1, d = 0;
			//e = list[1], f = list[2], g = list[3], h = list[4];
			
			// Reset p's for every call to account for changing second matrix
			int p1 = a * (list[2] - list[4]);
			int p2 = (a + b) * list[4];
			int p3 = (c + d) * list[1];
			int p4 = d * (list[3] - list[1]);
			int p5 = (a + d) * (list[1] + list[4]);
			int p6 = (b - d) * (list[3] + list[4]);
			int p7 = (a - c) * (list[1] + list[2]);
			
			// Multiply two matrices (with only 7 multiplications!)
			list[0] = list[0]-1;
			list[1] = p5 + p4 - p2 + p6;
			list[2] = p1 + p2;
			list[3] = p3 + p4;
			list[4] = p1 + p5 - p3 - p7;
			
			return strassen(list);
		}
	}
}