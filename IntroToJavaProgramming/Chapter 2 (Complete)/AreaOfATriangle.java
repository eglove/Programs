/* Write a program that prompts the user to enter three points
 * (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. The
 * formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2
 * area = sqrt(s(s - side1)(s - side2)(s - side3))
 * Here is a sample run:
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 */
import java.util.Scanner;
 
public class AreaOfATriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3;
		double side1, side2, side3;
		
		System.out.print("Enter three points for a triangle: ");
		x1 = input.nextDouble(); y1 = input.nextDouble();
		x2 = input.nextDouble(); y2 = input.nextDouble();
		x3 = input.nextDouble(); y3 = input.nextDouble();

		side1 = distance(x1,y1,x2,y2);
		side2 = distance(x2,y2,x3,y3);
		side3 = distance(x3,y3,x1,y1);
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		
		System.out.println("The area of the triangle is " + area);
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double side = (y2 - y1)/(x2 - x1);
		System.out.println(side);
		return side;
	}
}