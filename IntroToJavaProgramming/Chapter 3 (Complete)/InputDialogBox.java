/* Rewrite Listing 3.8, LeapYear.java, using the input dialog box. */
import javax.swing.JOptionPane;

public class InputDialogBox {
	public static void main(String[] args) {
		// Create a scanner
		String prompt = JOptionPane.showInputDialog("Enter a year: ");
		int year = Integer.parseInt(prompt);
		
		// Check if the year is a leap year
		boolean isLeapYear =
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		// Display the result
		JOptionPane.showMessageDialog(null, year + " is a leap year? " +
			isLeapYear);
	}
}