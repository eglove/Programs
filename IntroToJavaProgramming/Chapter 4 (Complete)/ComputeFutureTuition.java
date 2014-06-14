/* Suppose that the tuition for a university is $10,000 this year and increases 
 * 5% every year. Write a program that computes the tuition in ten years and the 
 * total cost of four years' worth of tuition starting ten years from now.
 */
import java.text.DecimalFormat;

public class ComputeFutureTuition {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$###,###.##");
		df.setMaximumFractionDigits(2);
		double tuition = 10_000;
		double total = 0;
		
		for(int i = 1; i <= 9; i++) {
			tuition = tuition + (tuition * .05);
		}
		
		for(int i = 1; i <= 4; i++) {
			tuition = tuition + (tuition * .05);
			System.out.println("Year " + i + ": " + df.format(tuition));
			total += tuition;
		}
		
		System.out.println("Total tuition starting 10 years from now: " + 
			df.format(total));
	}
}