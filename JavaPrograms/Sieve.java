import java.util.Scanner;
import java.util.Arrays;

public class Sieve {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		// Boolean array of n length;
		boolean[] a = new boolean[n + 1];
		// Initialize to true
		for(int i = 0; i < a.length; i++)
			a[i] = true;
			
		// Check if a[i] is prime.
		for(int i = 2; i*i < a.length; i++) {
			for(int j = i; i*j < a.length; j++) {
				a[i*j] = false;
			}
		}
		
		// Print primes
		int count = 0;
		for(int i = 2; i < a.length; i++) {
			if(a[i] == true) {
				System.out.print(i + " ");
				count++;
			}
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}