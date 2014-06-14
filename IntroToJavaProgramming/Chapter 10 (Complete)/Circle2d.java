public class Circle2d {
	private double x, y;
	private double radius;
	
	public Circle2d(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		if(radius - x > 0 && radius - y > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean contains(Circle2d circle) {
		if(this.radius > circle.radius && 
			this.radius - this.x > circle.radius - circle.x &&
			this.radius - this.y > circle.radius - circle.y)
			return true;
		else
			return false;
	}
	
	public boolean overlaps(Circle2d circle) {
		if(this.x + this.radius > circle.radius - circle.x ||
			this.y + this.radius > circle.radius - circle.y)
			return true;
		else
			return false;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
}