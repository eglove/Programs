/* Given an airplane's acceleration a and take-off speed v, you can compute the
 * minimum runway length needed for an airplane to take off using the following
 * formula:
 * length = v^2 / (2*a)
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s^2), and displays the
 * minimum runway length. Here is a sample run:
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 */
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class FindingRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = Math.pow(v,2.0) / (2 * a);
		System.out.println("The minimum runway length for this airplane is "
			+ df.format(length));
	}
}