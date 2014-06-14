import java.math.*;

public class ApproximateE {
	public static void main(String[] args) {
		BigDecimal n = BigDecimal.ONE;
		BigDecimal count = BigDecimal.ONE; // factorial element
		
		for(int i = 100; i <= 1000; i += 100) {
			n = n.divide(new BigDecimal(i + ""), 25, BigDecimal.ROUND_UP);
			count = count.add(n);
			
			System.out.println(n);
		}
	}
}