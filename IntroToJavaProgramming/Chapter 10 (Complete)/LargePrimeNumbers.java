import java.math.BigInteger;
import java.text.DecimalFormat;

public class LargePrimeNumbers {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
	
		BigInteger n = BigInteger.ONE;
		n = n.valueOf(Long.MAX_VALUE);
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 5; i++) {
			n = n.nextProbablePrime();
			
			// Check if actually prime
			if(isPrime(n)) {
				System.out.println("\n" + df.format(n));
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time spent is " + (endTime - startTime) +
			" milliseconds");
	}
	
	public static boolean isPrime(BigInteger n) {
		if(n.compareTo(BigInteger.ONE) == 0 ||
			n.compareTo(new BigInteger("2")) == 0) {
			
			return true;
		}
		
		BigInteger half = n.divide(new BigInteger("2"));
		
		for(BigInteger i = new BigInteger("2");
			i.compareTo(half) <= 0;
			i = i.add(BigInteger.ONE)) {
		
			if(n.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		
		return true;
	}
}