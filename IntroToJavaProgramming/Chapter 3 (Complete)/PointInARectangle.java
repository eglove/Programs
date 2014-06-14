/* Write a program that prompts the user to enter a point (x,y) and checks 
 * whether the point is within the rectangle centered at at (0,0) with width 10 
 * and height 5. For example, (2,2) is inside the rectangle and (6,4) is outside 
 * the rectangle, as shown in Figure 3.9b. (Hint: A point is in the rectangle if 
 * its horizontal distance to (0,0) is less than or equal to 5.0 / 2. Test your 
 * program to cover all cases.) Here are two sample runs.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PointInARectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		double x1 = 0, y1 = 0;
		double x2, y2, distance;
		
		System.out.print("Enter a point (x y): ");
		x2 = input.nextDouble(); y2 = input.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		if(distance <= 5 / 2) {
			System.out.println("The point (" + df.format(x2) + ", " + 
				df.format(y2) + ") is in the rectangle.");
		} else {
			System.out.println("The point (" + df.format(x2) + ", " + 
				df.format(y2) + ") is not in the rectangle.");
		}
	}
}