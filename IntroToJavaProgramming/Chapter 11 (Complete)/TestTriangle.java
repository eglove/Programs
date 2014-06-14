import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User enter three sides, color, and boolean for filled
		System.out.print("Enter three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter color: ");
		String color = input.nextLine();
		
		// To avoid printing next prompt early
		input.nextLine();
		
		System.out.print("Enter filled: ");
		boolean filled = input.hasNextBoolean();
		
		
		// Create triangle
		Triangle t = new Triangle(side1, side2, side3, color, filled);
		
		// Display area, perimeter, color, and true or false
		System.out.println("Area is: " + t.getArea() +
			"\nPerimeter is: " + t.getPerimeter() +
			"\nColor is: " + t.getColor() +
			"\nFilled is: " + t.isFilled());
	}
}