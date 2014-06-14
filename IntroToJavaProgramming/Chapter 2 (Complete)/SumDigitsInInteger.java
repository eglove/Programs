import java.util.Scanner;

public class SumDigitsInInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temp, thousands, hundreds, tens, ones;
		
		System.out.print("Enter a number between 0 and 1000: ");
		int n = input.nextInt();
		
		thousands = n / 1000;
		temp = n % 1000;
		hundreds = temp / 100;
		temp = temp % 100;
		tens = temp / 10;
		ones = temp % 10;
		
		int sum = thousands + hundreds + tens + ones;
		
		System.out.println("the sum of the digits is: " + sum);
	}
}