// Define the circle class with two contructors
class SimpleCircle {
	double radius;
	
	// Construct a circle with radius 1
	SimpleCircle() {
		radius = 1;
	}
	
	// Construct a circle with a specified radius
	SimpleCircle(double newRadius) {
		radius = newRadius;
	}
	
	// Return the area of this circle
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	// Set a new radius for this circle
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}