/* Write a program that prompts the user to enter the side of a hexagon and
 * displays its area. The formula for computing the area of a hexagon is
 * area = ((3 * sqrt(3))/(2)) * s^2
 * where s is the length of a side. Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfAHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double root = Math.sqrt(3); double square = Math.pow(side,2);
		double area = ((3*root)/2)*square;
		System.out.println("The area of the hexagon is " + df.format(area));
	}
}