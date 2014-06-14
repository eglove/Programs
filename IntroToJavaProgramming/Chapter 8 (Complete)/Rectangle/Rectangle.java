public class Rectangle {
	// Default height and width
	private double width = 1, height = 1;
	
	// No-arg contructor
	public Rectangle() {
	}
	
	// Create rectangle with specified with and height
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	// Gets for width & height
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	// Return area of rectangle
	public double getArea() {
		return width * height;
	}
	
	// Return perimeter
	public double getPerimeter() {
		return width * 2 + height * 2;
	}
}