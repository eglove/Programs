/* Rewrite Exercise 1.11 to prompt the user to enter the number of years and
 * displays the population after the number of years. Here is a sample run of
 * the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class PopulationProjection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(0);
	
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
	
		double pop = 312032486;
		double days = 365;
		double hours = 365 * 24;
		double minutes = hours * 60;
		double seconds = minutes * 60;
		double oneYear = (seconds / 7) - (seconds / 13) + (seconds / 45);
		
		double endPop = (pop + (oneYear * years));
		System.out.println("Population: " + df.format(endPop));
	}
}