/* Rewrite Exercise 2.25 using GUI input and output dialog boxes. */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PayrollGui {
	public static void main(String[] args) {
		DecimalFormat mon = new DecimalFormat("$#.##");
		mon.setMinimumFractionDigits(2);
		DecimalFormat decim = new DecimalFormat("(#%)");
		String name;
		int hours;
		double payRate, fedRate, stateRate;
		double grossPay, fedWith, stateWith, totalDeduc, netPay;
		
		name = JOptionPane.showInputDialog("Enter employee's name: ");
		
		String hoursString = JOptionPane.showInputDialog(
			"Enter number of hours worked in a week: ");
		hours = Integer.parseInt(hoursString);
		
		String payString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		payRate = Double.parseDouble(payString);
		
		String fedString = JOptionPane.showInputDialog(
			"Enter federal tax withholding rate: ");
		fedRate = Double.parseDouble(fedString);
		
		String stateString = JOptionPane.showInputDialog(
			"Enter state tax withholding rate: ");
		stateRate = Double.parseDouble(stateString);
		
		grossPay = hours * payRate;
		fedWith = grossPay * fedRate;
		stateWith = grossPay * stateRate;
		totalDeduc = fedWith + stateWith;
		netPay = grossPay - totalDeduc;
		
		String output = "Employee's name: " + name +
			"\nHours Worked: " + hours +
			"\nPay rate: " + mon.format(payRate) +
			"\nGross Pay: " + mon.format(grossPay) +
			"\nDeductions: " +
			"\n\tFederal Withholding " + decim.format(fedRate) + ": " + 
				mon.format(fedWith) +
			"\n\tState Withholding " + decim.format(stateRate) + ": " + 
				mon.format(stateWith) +
			"\n\tTotal Deduction: " + mon.format(totalDeduc) +
			"\nNet Pay: " + mon.format(netPay);
		JOptionPane.showMessageDialog(null,output);
	}
}