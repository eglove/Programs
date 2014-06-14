public class QuadraticEquation {
	private double a, b, c;
	
	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Mutators
	double getA() {
		return a;
	} double getB() {
		return b;
	} double getC() {
		return c;
	}
	
	// Returns discriminant
	double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	// Get two roots of equation 1 and 2
	double getRoot1() {
		if(getDiscriminant() >= 0) {
			return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}
	}
	double getRoot2() {
		if(getDiscriminant() >= 0) {
			return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}
	}
}