import java.text.DecimalFormat;
import java.math.BigInteger;

public class Divisible {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
	
		// Start with 50 digit number
		BigInteger n = BigInteger.TEN;
		n = n.pow(49);
		
		BigInteger zero = BigInteger.ZERO;
		BigInteger one = BigInteger.ONE;
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		
		int count = 1;
		while(count <= 10) {
			if(n.mod(two) == zero || n.mod(three) == zero)
				System.out.println(df.format(n));
			
			count++;
			n = n.add(one);
		}
	}
}