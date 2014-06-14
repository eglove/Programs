import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputeVolumeOfCylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		DecimalFormat df2 = new DecimalFormat("#.#");
		
		System.out.print("Enter the radius and the length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + df.format(area) +
			"\nThe volume is " + df2.format(volume));
	}
}