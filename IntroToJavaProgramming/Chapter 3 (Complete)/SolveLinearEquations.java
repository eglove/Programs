/* You can use Cramer's rule to solve the following 2x2 system of linear
 * equation:
 * ax + by = e  x = (ed - bf)/(ad - bc)
 * ex + dy = f	y = (af - ec)/(ad - bc)
 * Write a program that prompts the user to enter a,b,c,d,e, and f and displays
 * the result. If ad - bc is 0, report that "The equation has no solution".
 * Enter a, b, c, d, e, f: 9.0 4.0 2.0 -5.0 -6.0 -21.0
 * x is -2.0 and y is 3.0
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
 * The equation has no solution.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class SolveLinearEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble(); double b = input.nextDouble();
		double c = input.nextDouble(); double d = input.nextDouble();
		double e = input.nextDouble(); double f = input.nextDouble();
		
		if((a * d - b * c) == 0) {
			System.out.println("The equation has no solution.");
		} else {
			double x = (e * d - b * f)/(a * d - b * c);
			double y = (a * f - e * c)/(a * d - b * c);
			System.out.println("x is " + df.format(x) + " and y is " + 
				df.format(y));
		}
	}
}