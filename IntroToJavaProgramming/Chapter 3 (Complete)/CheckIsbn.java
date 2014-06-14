/* An ISBN-10 (International Standard Book Number) consists of 10 digits:
 * d1,d2,d3,d4,d5,d6,d7,d8,d9,d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 +
 * d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the
 * ISBN-10 convention. Write a program that prompts the user to enter the first
 * 9 digits and displays the 10-digit ISBN (including leading zeros). Your
 * program should read the input as an integer. Here are sample runs:
 * Enter the first 9 digits of an ISBN as integer: 013601267
 * The ISBN-10 number is 0136012671
 * Enter the first 9 digits of an ISBN as integer: 013031997
 * The ISBN-10 number is 013031997X
 */
import java.util.Scanner;

public class CheckIsbn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String entry = input.nextLine();
		
		int d1 = Character.getNumericValue(entry.charAt(0));
		int d2 = Character.getNumericValue(entry.charAt(1));
		int d3 = Character.getNumericValue(entry.charAt(2));
		int d4 = Character.getNumericValue(entry.charAt(3));
		int d5 = Character.getNumericValue(entry.charAt(4));
		int d6 = Character.getNumericValue(entry.charAt(5));
		int d7 = Character.getNumericValue(entry.charAt(6));
		int d8 = Character.getNumericValue(entry.charAt(7));
		int d9 = Character.getNumericValue(entry.charAt(8));
		
		int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + 
			(d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
			
		if(d10 == 10) {
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + ""
				+ d6 + "" + d7 + "" + d8 + "" + d9 + "X");
		} else {
			System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + ""
				+ d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10);
		}
	}
}