/* Average acceleration is defined as the change of velocity divided by the
 * time take to make the change, as shown in the following formula:
 * a = (v1 - v0)/t
 * Write a program that prompts the user to enter the starting velocity v0 in
 * meters/second, the ending velocity v1 in meters/second, and the time span t
 * in seconds, and displays the average acceleration. Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */
 import java.util.Scanner;
 import java.text.DecimalFormat;

public class Acceleration {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
			System.out.print("Enter v0, v1, and t: ");
			double v0 = input.nextDouble();
			double v1 = input.nextDouble();
			double t = input.nextDouble();
			
			accelerate(v0, v1, t);
	}
	
	public static void accelerate(double v0, double v1, double t) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
	
		double a = (v1 - v0)/t;
		System.out.println("The average acceleration is " + df.format(a));
	}
}