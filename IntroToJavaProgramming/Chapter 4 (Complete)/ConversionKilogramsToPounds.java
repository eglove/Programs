/* Write a program that displays the following table (note that 1 kilogram is 
 * 2.2 pounds):
 * Kilograms Pounds
 * 1         2.2
 * 3         6.6
 * ...       ...
 * 197       433.4
 * 199       437.8
 */
import java.text.DecimalFormat;

public class ConversionKilogramsToPounds {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		// Print header
		System.out.println("Kilograms\tPounds");
		
		for(int i = 1; i < 200; i++) {
			System.out.println(i + "\t\t" + df.format(i * 2.2));
		}
	}
}