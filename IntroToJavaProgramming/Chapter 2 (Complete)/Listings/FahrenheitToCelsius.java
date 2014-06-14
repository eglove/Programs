import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		
		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " +
			celsius + " in Celsius");
	}
}