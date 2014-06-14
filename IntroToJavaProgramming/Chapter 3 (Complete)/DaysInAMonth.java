/* Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month. For example, if the user entered 
 * month 2 and the year 2012, the programs should display that February 2012 had
 * 29 days. If the user entered month 3 and year 2015, the program should 
 * display that March 2015 had 31 days.
 */
import java.util.Scanner;

public class DaysInAMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		boolean isLeapYear =
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		switch (month) {
			case 1: System.out.println("January " + year + " has " + 31 
				+ " days.");
				break;
			case 2: if(isLeapYear) {
						System.out.println("February " + year + " has " + 29
							+ " days.");
					} else {
						System.out.println("February " + year + " has " + 28
							+ " days.");
					} break;
			case 3: System.out.println("March " + year + " has " + 31 
				+ " days.");
				break;
			case 4: System.out.println("April " + year + " has " + 30
				+ " days.");
				break;
			case 5: System.out.println("May " + year + " has " + 31 + " days.");
				break;
			case 6: System.out.println("June " + year + " has " + 30 
				+ " days.");
				break;
			case 7: System.out.println("July " + year + " has " + 31
				+ " days.");
				break;
			case 8: System.out.println("August " + year + " has " + 31
				+ " days.");
				break;
			case 9: System.out.println("September " + year + " has " + 30
				+ " days.");
				break;
			case 10: System.out.println("October " + year + " has " + 31
				+ " days.");
				break;
			case 11: System.out.println("November " + year + " has " + 30
				+ " days.");
				break;
			case 12: System.out.println("December " + year + " has " + 31
				+ " days.");
		}
	}
}