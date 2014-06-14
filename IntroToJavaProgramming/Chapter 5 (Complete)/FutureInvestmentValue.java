/* Write a method that computes future investment value at a given interest rate 
 * for a specified number of years. The future investment is determined using 
 * the formula in Programming Exercise 2.21. Use the following method header:
 * public static double futureInvestmentValue(
 * 		double investmentAmount, double montlhyInterestRate, int years)
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount 
 * (e.g., 1000) and the interest rate (e.g., 9%) and prints a table that 
 * displays future value for the years from 1 to 30, as shown below:
 * The amount invested: 1000
 * Annual interest rate: 9
 * Years	Future Value
 * 1        1093.80
 * 2        1196.41
 * ...
 * 29       13467.25
 * 30       14730.57
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class FutureInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.##");
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		System.out.print("The amount invested: ");
		double invested = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualRate = input.nextDouble();
		
		annualRate = annualRate / 100;
		
		System.out.println("Years\tFuture Value");
		
		for(int i = 1; i <= 30; i++) {
			double futureValue = 
				futureInvestmentValue(invested, annualRate/12, i);
				
			System.out.println(i + "\t" + df.format(futureValue));
		}
	}
	
	public static double futureInvestmentValue
		(double investmentAmount, double monthlyInterestRate, int years) {
		double x = investmentAmount;
		
		for(int i = 1; i <= years; i++) {
			x += (investmentAmount * monthlyInterestRate) * 12;
		}
		
		return x;
	}
}