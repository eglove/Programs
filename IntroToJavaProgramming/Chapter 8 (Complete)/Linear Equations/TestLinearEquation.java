import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation in = new LinearEquation(a,b,c,d,e,f);
		
		if(in.isSolvable()) {
			System.out.println("X is: " + in.getX());
			System.out.println("Y is: " + in.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
	}
}