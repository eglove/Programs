import java.math.BigInteger;
import java.text.DecimalFormat;

public class SquareNumbers {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
	
		BigInteger n = BigInteger.ONE;
		n = n.valueOf(Long.MAX_VALUE);
		
		for(int i = 0; i < 10; i++) {
			n = n.pow(2);
			System.out.println("\n" + df.format(n));
		}
	}
}