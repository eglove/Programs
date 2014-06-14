/* Exercise 2.17 gives a formula to compute the wind-chill temperature. The 
 * formula is valid for temperatures in the range between -58F and 41F and wind 
 * speed greater than or equal to 2. Write a program that prompts the user to 
 * enter a temperature and a wind speed. The program displays the wind-chill 
 * temperature if the input is valid; otherwise, it displays a message 
 * indicating whether the temperature and/or wind speed is invalid.
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
		
		if(temp < -58 || temp > 41 && speed < 2) {
			System.out.println("Temperature and speed is invalid.");
		} else if(temp < -58 || temp > 41) {
			System.out.println("Temperature is invalid.");
		} else if(speed < 2) {
			System.out.println("Speed is invalid.");
		} else {
			speed = Math.pow(speed,0.16);
			double windChill = 35.74 + (0.6215 * temp) - (35.75 * speed) + 
				(0.4275 * temp * speed);
			
			System.out.println("The wind chill index is " + 
				df.format(windChill));
		}
	}
}