import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$##.##");
		df.setMinimumFractionDigits(2);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double sub = input.nextDouble();
		double rate = input.nextDouble();
		
		double grat = rate / 10;
		double total = grat + sub;
		
		System.out.println("The gratuity is " + df.format(grat)
			+ " and total is " + df.format(total));
	}
}