import java.util.Scanner;
import java.text.DecimalFormat;

public class TestQuadraticEquations {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// Decimal formattng
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setMaximumFractionDigits(5);
		df.setMinimumFractionDigits(0);
		
		System.out.print("\nEnter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Create object and find discriminant
		QuadraticEquation user = new QuadraticEquation(a, b, c);
		double disc = user.getDiscriminant();
		
		if(disc > 0) {
			System.out.println("\nThe roots are " + df.format(user.getRoot1()) +
				" and " + df.format(user.getRoot2()));
		} else if(disc == 0) {
			System.out.println("\nThe root is " + df.format(user.getRoot2()));
		} else {
			System.out.println("\nThe equation has no real roots.");
		}
	}
}