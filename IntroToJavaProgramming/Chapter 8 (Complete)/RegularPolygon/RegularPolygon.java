public class RegularPolygon {
	private int n = 3; // Number of sides
	private double side = 1; // Length of side
	private double x = 0; // x axis
	private double y = 0; // y axis
	
	// No-arg constructor
	RegularPolygon() {
	}
	
	// For axis at 0,0
	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	// Specifying everything
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	// Accessors
	int getN() {
		return n;
	}
	double getSide() {
		return side;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	// Mutators
	void setN() {
		this.n = n;
	}
	void setSide() {
		this.side = side;
	}
	void setX() {
		this.x = x;
	}
	void setY() {
		this.y = y;
	}
	
	// Get perimeter
	double getPerimeter(int n, double side) {
		return n * side;
	}
	
	// Get area
	double getArea(int n, double side) {
		double numerator = (n * (Math.pow(side,2)));
		double tan = Math.atan(Math.PI / n);
		return (numerator) / (4 * tan);
	}
}