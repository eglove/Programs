public class TestCircle2d {
	public static void main(String[] args) {
		// Create circle c1
		Circle2d c1 = new Circle2d(2, 2, 5.5);
		
		// Display area and perimeter
		System.out.println("Area is: " + c1.getArea() +
			"\nPerimeter is: " + c1.getPerimeter());
		
		// Display result of c1.contains(3, 3)
		System.out.println(c1.contains(3, 3));
		
		// contains(new Circle2d(4, 4, 10.5)
		System.out.println(c1.contains(new Circle2d(4, 4, 10.5)));
		
		// overlaps(new Circle2d(3, 5, 2.3)
		System.out.println(c1.overlaps(new Circle2d(3, 5, 2.3)));
		
	}
}