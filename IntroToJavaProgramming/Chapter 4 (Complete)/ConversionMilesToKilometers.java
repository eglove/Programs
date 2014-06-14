/* Write a program that displays the following table (note that 1 mile is 1.609 
 * kilometers);
 * Miles Kilometers
 * 1     1.609
 * 2     3.218
 * ...   ...
 * 9     14.481
 * 10    16.090
 */
import java.text.DecimalFormat;

public class ConversionMilesToKilometers {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("Miles\tKilometers");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + df.format((i * 1.609)));
		}
	}
}