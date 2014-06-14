import java.math.BigInteger;
import java.text.DecimalFormat;

public class MersennePrime {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
		BigInteger n = BigInteger.ONE;
		
		long startTime = System.currentTimeMillis();
		
		// Print header
		System.out.println("p\t2^p-1");
		
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				n = n.valueOf(i);
				n = n.pow(2);
				n = n.subtract(BigInteger.ONE);
				System.out.println(i + "\t" + df.format(n));
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time took: " + (endTime - startTime) +
			" milliseconds.");
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}