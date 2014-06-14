/* Write a program that reads in investment amount, annual interest rate, and
 * number of years, and displays the future investment value using the following
 * formula:
 * futureInvestmentValue = investmentAmount * 
 * 		(1 + monthlyInterestRate)^(numberOfYears*12)
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98. Here is a sample run:
 * Enter investment amount: 1000
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $1043.34
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateFutureInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.##");
		df.setMinimumFractionDigits(2);
		double investment, interestRate, years, value;
		
		System.out.print("Enter investment amount: ");
		investment = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		interestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		years = input.nextDouble();
		
		interestRate = interestRate / 100;
		value = investment * (Math.pow((1 + interestRate),(years*12)));
		
		System.out.println("Accumulated value is " + df.format(value));
	}
}