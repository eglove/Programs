import java.util.Scanner;

public class PrimeSummation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		// Find prime factors
		System.out.println(primeSum(num));
	}
	
	public static int primeSum(int n) {
		int sum = 0;
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				sum += i;
				n /= i;
			}
		}
		return sum;
	}
}