/* wind chill = 35.74 + 0.6215 * outside temperature - 35.75 * speed^0.16
 *	+ 0.4275 * outside temperature * speed^0.16
 * Sample run:
 * Enter the temperature in Fahrenheit: 5.3
 * Enter the wind speed in miles per hour: 6
 * The wind chill index is -5.56707
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temp = input.nextDouble();
		System.out.print("Enter the wind speed in miles per hour: ");
		double speed = input.nextDouble();
		
		speed = Math.pow(speed,0.16);
		double windChill = 35.74 + (0.6215 * temp) - (35.75 * speed) + 
			(0.4275 * temp * speed);
			
		System.out.println("The wind chill index is " + df.format(windChill));
	}
}