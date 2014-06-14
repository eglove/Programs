public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6 ,4);
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// Display perimeters and areas
		System.out.println("\nPolygon 1" +
			"\nPerimeter: " + poly1.getPerimeter(poly1.getN(), poly1.getSide()) +
			"\nArea: " + poly1.getArea(poly1.getN(), poly1.getSide()));
			
		System.out.println("\nPolygon 2" +
			"\nPerimeter: " + poly2.getPerimeter(poly2.getN(), poly2.getSide()) +
			"\nArea: " + poly2.getArea(poly2.getN(), poly2.getSide()));
			
		System.out.println("\nPolygon 3" +
			"\nPerimeter: " + poly3.getPerimeter(poly3.getN(), poly3.getSide()) +
			"\nArea: " + poly3.getArea(poly3.getN(), poly3.getSide()));
	}
}