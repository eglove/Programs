import java.util.Arrays;

public class PrimeNumber {
	public static void main(String[] args) {
		int numOfPrimes = 50;
		int[] array = new int[50];
		
		// Initialize array values
		initialize(array);
		
		// Find primes in 50 less than or equal to sqrt(50)
		array = findPrimes(array, (int)(Math.sqrt(50)));
		
		// Print array minus 1 and 0's
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0 && array[i] != 1) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
	public static int[] findPrimes(int[] a, int n) {
		
		// Set non-primes to 0
		for(int i = 0; i < a.length; i++) {
			for(int j = 2; j <= n; j++) {
				if(a[i] % j == 0)
					a[i] = 0;
			}
		}
		
		return a;
	}
	
	public static void initialize(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
	}
}