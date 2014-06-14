import java.math.BigInteger;
import java.text.DecimalFormat;

public class Divisible5Or6 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
	
		BigInteger n = BigInteger.ONE;
		n = n.valueOf(Long.MAX_VALUE);
		
		int count = 0;
		while(count < 10) {
			if(n.mod(new BigInteger("5")) == BigInteger.ZERO || 
				n.mod(new BigInteger("6")) == BigInteger.ZERO) {
				
				System.out.println("\n" + df.format(n));
				count++;
			}
			
			n.add(BigInteger.ONE);
		}
	}
}