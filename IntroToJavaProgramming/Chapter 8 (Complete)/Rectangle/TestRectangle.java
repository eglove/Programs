public class TestRectangle {
	public static void main(String[] args) {
		
		// Create two rectangle objects
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// Print width, height, area, perimeter
		display(r1);
		display(r2);
	}
	
	public static void display(Rectangle x) {
		System.out.println("Width: " + x.getWidth() + "\nHeight: " + x.getHeight() +
			"\nArea: " + x.getArea() + "\nPerimeter: " + x.getPerimeter() + "\n");
	}
}