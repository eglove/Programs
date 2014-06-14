public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	// No arg contructor
	Fan() {
	}
	
	// Accessor
	int getSpeed() {
		return speed;
	}
	boolean getOn() {
		return on;
	}
	double getRadius() {
		return radius;
	}
	String getColor() {
		return color;
	}
	
	// Mutator
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setOn(boolean on) {
		this.on = on;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	// toString return method
	public String toString() {
		return("Speed is: " + speed +
			"\nColor is: " + color +
			"\nRadius is: " + radius +
			((on) ? "" : "\nFan is off."));
	}
}