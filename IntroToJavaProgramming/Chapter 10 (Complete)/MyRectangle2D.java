import java.awt.geom.Rectangle2D;

public class MyRectangle2D {
	// x and y specify the center of the rectangle
	private double x, y;
	// Fields for width and height of rectangle
	private double width, height;
	
	// No-arg constructor creates default rectangle (0, 0) and 1 width 1 height
	MyRectangle2D() {
		this.x = 0; this.y = 0;
		this.width = 1; this.height = 1;
	}
	
	// Constructor with specified x, y, width and height
	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x; this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// Return area of rectangle
	public double getArea() {
		return width * height;
	}
	
	// Return perimeter of rectangle
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
	// contains(x,y) true if point is inside rectangle
	public boolean contains(double x, double y) {
		
	}
	
	// contains(MyRectangle2D r) true if rectangle is inside this rectangle
	public boolean contains(MyRectangle2D r) {
		contains(r.x, r.y);
	}
	
	// overlaps(MyRectangle2D r) return true if specified rectangle overlaps
	public boolean overlaps(MyRectangle2D r) {
		// if(this.y < r.y || this.y > r.y
	}
	
	// Get and set for x and y
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	// Get and set for width and height
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
}