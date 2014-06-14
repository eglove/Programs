/* If you know the balance and the annual percentage interest rate, you can
 * compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate / 1200)
 * Write a program that reads the balance and the annual percentage interest
 * rate and displays for the next month. Here is the sample run:
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		double balance, rate, interest;
		
		System.out.print("Enter the balance and interest rate"
			+ " (e.g., 3 for 3%): ");
		balance = input.nextDouble(); rate = input.nextDouble();
		
		interest = balance * (rate / 1200);
		
		System.out.println("The interest is " + df.format(interest));
	}
}