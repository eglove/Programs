public class TestCircleWithPrivateDataFields {
	// Main method
	public static void main(String[] args) {
		// Create a circle with radius 5.0
		CircleWithPrivateDataFields myCircle =
			new CircleWithPrivateDataFields(5.0);
		System.out.println("the area of the circle of radius " 
			+ myCircle.getRadius() + " is " + myCircle.getArea());
			
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("the area of the circle of radius "
			+ myCircle.getRadius() + " is " + myCircle.getArea());
			
		System.out.println("the number of objects created is "
			+ CircleWithPrivateDataFields.getNumberOfObjects());
	}
}