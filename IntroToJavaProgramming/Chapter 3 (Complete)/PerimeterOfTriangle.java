/* Write a program that reads three edges for a triangle and computes the 
 * perimeter if the input is valid. Otherwise, display that the input is 
 * invalid. The input is valid if the sum of every pair of two edges is greater 
 * than the remaining edge.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PerimeterOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("Enter three side lengths: ");
		double side1 = input.nextDouble(); double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if(side1 + side2 > side3 && side2 + side3 > side1 &&
			side3 + side1 > side2) {
			System.out.println("The input is valid. " + df.format((side1 + side2
				+ side3)));
		} else {
			System.out.println("The input is invalid.");
		}
	}
}