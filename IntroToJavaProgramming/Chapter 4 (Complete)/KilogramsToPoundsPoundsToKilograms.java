/* Write a program that displays the following two tables side by side (note 
 * that 1 kilogram is 2.2 pounds and that 1 pound is .453 kilograms):
 */
import java.text.DecimalFormat;
 
 public class KilogramsToPoundsPoundsToKilograms {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
		
		for(int i = 1, j = 20; i < 200; i += 2, j += 5) {
			System.out.println(i + "\t\t" + df.format((i * 2.2)) + "\t|\t" 
				+ j + "\t\t" + df.format((j * .453)));
		}
	}
 }