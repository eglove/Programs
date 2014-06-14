public class PrimeNumbers {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers(1); // Size 1, will expand
		int num = 120;
		
		// Find primes less than 120, push to stack
		primes(num, stack);
		
		// Display primes in descending order, 10 per line
		int count = 0;
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
			count++;
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	public static void primes(int n, StackOfIntegers s) {
		for(int i = 2; i <= n; i++)
			if(isPrime(i))
				s.push(i);
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < n; i++)
			if((n % i) == 0)
				return false;
				
		return true;
	}
}