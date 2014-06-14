public class TestMyRectangle2D {
	public static void main(String[] args) {
	
		MyRectangle2D r1 = new MyRectangle2D(4, 5, 10.5, 3.2);
		
		System.out.println("Perimeter is " + r1.getPerimeter() +
			"Area is " + r1.getArea());
			
		System.out.println(r1.contains(3, 3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
	}
}