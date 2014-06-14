/* Rewrite Listing 2.10, ComputeChange.java, using input and output dialog
 * boxes.
 */
import javax.swing.JOptionPane;

public class UseInputDialog {
	public static void main(String[] args) {
		
		// Receive the amount
		String input = JOptionPane.showInputDialog(
			"Enter the ammount, for example, 11.56: ");
		double amount = Double.parseDouble(input);
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Display results
		String output = "Your amount " + amount + " consists of \n" +
			"\t" + numberOfOneDollars + " dollars\n" +
			"\t" + numberOfQuarters + " quarters\n" +
			"\t" + numberOfDimes + " dimes\n" +
			"\t" + numberOfNickels + " nickels\n" +
			"\t" + numberOfPennies + " pennies";
		JOptionPane.showMessageDialog(null,output);
	}
}