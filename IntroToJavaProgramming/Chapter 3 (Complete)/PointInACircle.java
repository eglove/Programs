/* Write a program that prompts the user to enter point (x,y) and checks whether 
 * the point is within the circle centered at (0,0) with radius 10. For example, 
 * (4,5) is inside the circle and (9,9) is outside the circle, as shown in 
 * Figure 3.9a.
 * Enter a point with two coordinates: 4 5
 * Point (4, 5) is in the circle.
 * Enter a point with two coordinates: 9 9
 * Point (9, 9) is not in the circle.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PointInACircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		double x1 = 0, y1 = 0;
		
		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble(); double y2 = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x2 - x1),2) + 
			Math.pow(y2 - y1,2));
			
		if(distance < 10) {
			System.out.println("Point (" + df.format(x2) + ", " + df.format(y2)
				+ ") is in the circle.");
		} else if(distance > 10) {
			System.out.println("Point (" + df.format(x2) + ", " + df.format(y2)
				+ ") is not in the circle.");
		} else {
			System.out.println("Point (" + df.format(x2) + ", " + df.format(y2)
				+ ") is on the circle.");
		}
	}
}