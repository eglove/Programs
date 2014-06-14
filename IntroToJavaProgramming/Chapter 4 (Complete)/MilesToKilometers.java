/* Write a program that displays the following two tables side by side (not that 
 * 1 mile is 1.609 kilometers and that 1 kilometer is .621 miles):
 */
import java.text.DecimalFormat;
 
 public class MilesToKilometers {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
		
		for(int i = 1, j = 20; j <= 65; i++, j += 5) {
			System.out.println(i + "\t" + df.format((i * 1.609)) + "\t\t|\t" 
				+ j + "\t\t" + df.format((j * .621)));
		}
	}
 }