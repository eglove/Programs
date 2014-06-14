import java.util.Scanner;

public class ConvertCelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// Ask for celsius
		System.out.print("Enter a degree in Celsius: ");
		double cel = input.nextDouble();
		
		// Convert
		double fah = (9.0 / 5.0) * cel + 32;
		
		System.out.println(cel + " Celsius is " + fah + " Fahrenheit");
	}
}