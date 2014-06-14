/* Write a program that reads the following information and prints a payroll
 * statement:
 * Enter employee's name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 6.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 * 
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $6.75
 * Gross Pay: $67.5
 * Deductions:
 * 		Federal Withholding (20.0%): $13.5
 *		State Withholding (9.0%): $6.07
 *		Total Deduction: $19.57
 * Net Pay: $47.92
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat mon = new DecimalFormat("$#.##");
		mon.setMinimumFractionDigits(2);
		DecimalFormat decim = new DecimalFormat("(#%)");
		String name;
		int hours;
		double payRate, fedRate, stateRate;
		double grossPay, fedWith, stateWith, totalDeduc, netPay;
		
		System.out.print("Enter employee's name: ");
		name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		hours = input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		fedRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		stateRate = input.nextDouble();
		
		grossPay = hours * payRate;
		fedWith = grossPay * fedRate;
		stateWith = grossPay * stateRate;
		totalDeduc = fedWith + stateWith;
		netPay = grossPay - totalDeduc;
		
		System.out.println("Employee's name: " + name +
			"\nHours Worked: " + hours +
			"\nPay rate: " + mon.format(payRate) +
			"\nGross Pay: " + mon.format(grossPay) +
			"\nDeductions: " +
			"\n\tFederal Withholding " + decim.format(fedRate) + ": " + 
				mon.format(fedWith) +
			"\n\tState Withholding " + decim.format(stateRate) + ": " + 
				mon.format(stateWith) +
			"\n\tTotal Deduction: " + mon.format(totalDeduc) +
			"\nNet Pay: " + mon.format(netPay));
	}
}