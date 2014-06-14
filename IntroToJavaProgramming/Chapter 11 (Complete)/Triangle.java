public class Triangle extends SimpleGeometricObject {
		private double side1;
		private double side2;
		private double side3;
		
		// Default, no-arg
		public Triangle() {
			this.side1 = 1;
			this.side2 = 1;
			this.side3 = 1;
		}
		
		// Constructor for specified sides
		public Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		// Input extensions
		public Triangle(double side1, double side2, double side3, String color,
			boolean filled) {
			
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			setColor(color);
			setFilled(filled);
		}
		
		// Return area of triangle
		public double getArea() {
			// Heron's formula
			double p = (getPerimeter()) / 2; // Half of perimeter
			return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		}
		
		// Return perimeter of triangle
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
		
		// Display description of triangle
		@Override
		public String toString() {
			return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
		}
		
		// Accessors for sides
		public double getSide1() {
			return side1;
		}
		public double getSide2() {
			return side2;
		}
		public double getSide3() {
			return side3;
		}
}