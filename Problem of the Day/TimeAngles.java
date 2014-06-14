/* Write a program to find the minimum angle between two hands on a 24 hour
 * clock. For instance, the angle at 6:00 is 90 degrees and the angle at 18:00
 * is also 90 degrees.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeAngles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("Enter time (e.g. 6:17, 5:40): ");
		String userIn = input.nextLine();
		
		// Get two integers from time.
		String[] numStr = userIn.split(":");
		int[] times = new int[numStr.length];
		
		for(int i = 0; i < numStr.length; i++) {
			times[i] = Integer.parseInt(numStr[i]);
		}
		
		// Calculate angle between two hands.
		double angle = angleCalc(times[0], times[1]);
		
		System.out.println(df.format(angle) + " degrees");
	}
	
	static double angleCalc(double hour, double minute) {
		// Calculate angle with (Hours relative to degrees) - 
		//		(Minutes relative to degrees)
		// Minute / 60 converts to decimal hour
		
		double dph = 360 / 24; // Degrees per hour
		double minOnFace = minute / 5; // Where minute hand is at on clock face
		
		double hourAngle = hour * dph;
		double minAngle = minOnFace * dph;
		double angle = hourAngle - minAngle;
		
		// If minute > hour, will return negative
		// Make sure number is positive.
		if(angle < 0) {
			angle = Math.abs(angle);
		}
		
		// Looking for smallest distance of two.
		if(angle > 180) {
			return 360 - angle;
		} else {
			return angle;
		}
	}
}