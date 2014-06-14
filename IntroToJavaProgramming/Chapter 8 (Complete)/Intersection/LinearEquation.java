public class LinearEquation {
	private double a, b, c, d, e, f;
	
	// Constructor w/ specified variables
	LinearEquation(double a, double b, double c,
		double d, double e, double f) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	// Mutators for all six variables
	double getA() {
		return a;
	} double getB() {
		return b;
	} double getC() {
		return c;
	} double getD() {
		return d;
	} double getE() {
		return e;
	} double getF() {
		return f;
	}
	// isSolvable() returns true if ad - bc is not 0
	boolean isSolvable() {
		if(a * d - b * c == 0)
			return false;
		else
			return true;
	}
	
	// getX() and getY() returns solution to equations
	double getX() {
	
		double numerator = (e * d) - (b * f);
		double denominator = (a * d) - (b * c);
		return numerator / denominator;
	}
	double getY() {
		
		double numerator =  (a * f) - (e * c);
		double denominator = (a * d) - (b * c);
		return numerator / denominator;
	}
}