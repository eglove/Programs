/* b^2 - 4ac is called the discriminant of the quadratic equation. If it is
 * positive, the equation has two real roots. If it is zero, the equation has
 * one root. If it is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and
 * displays the result based on the discriminant. If the discriminant is
 * positive, display two roots. If the discriminant is 0, display on root.
 * Otherwise, display "The Equation has no real roots".
 * Enter a, b, c: 1.0 3 1
 * The roots are -0.381966 and -2.61803
 * Enter a, b, c: 1 2.0 1
 * The root is -1
 * Enter a, b, c: 1 2 3
 * The equation has no real roots.
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;

public class SolveQuadraticEquations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
	
		// Get user input a, b and c.
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Get discriminant
		double disc = Math.pow(b,2) - (4 * a * c);
		
		// If disc is positive get two roots
		if(disc > 0) {
			double root1 = (-b + Math.sqrt(disc))/(2*a);
			double root2 = (-b - Math.sqrt(disc))/(2*a);
			System.out.println("The roots are " + df.format(root1) + " and " + 
				df.format(root2));
		}else if(disc == 0) {
			double root = (-b + Math.sqrt(disc))/(2*a);
			System.out.println("The root is " + df.format(root));
		}else {
			System.out.println("The equation has no real roots.");
		}
	}
}