/* Write a program that prompts the user to enter two points (x1, y1) and
 * (x2, y2) and displays their distance between them. The formula for
 * computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note that you can
 * use Math.pow(a,0.5) to compute sqrt(a). Here is a sample run:
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * The distance between the two points is 8.764131445842194
 */
import java.util.Scanner;

public class DistanceOfTwoPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;		
		
		System.out.print("Enter x1 and y1: ");
		x1 = input.nextDouble(); y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextDouble(); y2 = input.nextDouble();
		
		double x = Math.pow((x2 - x1),2);
		double y = Math.pow((y2 - y1),2);
		double distance = Math.sqrt(x + y);
		
		System.out.println("The distance between the two points is " + distance);
	}
}