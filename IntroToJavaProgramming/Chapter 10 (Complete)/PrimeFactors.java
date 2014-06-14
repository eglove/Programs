import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create stack of size one
		StackOfIntegers stack = new StackOfIntegers(1);
		
		// Prompts user to integer
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		// Find smallest factors, push to stack
		factors(num, stack);
		
		// Print integers
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
	
	public static void factors(int n, StackOfIntegers stack) {
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				stack.push(i);
				n = n / i;
				i = 1; // Loop does ++ to 2
			}
		}
	}
}