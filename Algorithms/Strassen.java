// Use Strassen's method for multiplying two 2x2 matrices.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Strassen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Matrix 1
		double a, b, c, d;
		// Matrix 2
		double e, f, g, h;
		// Matrix 3 (answer)
		double i, j, k, l;
		// P's
		double p1, p2, p3, p4, p5, p6, p7;
		
		System.out.print("Enter first matrix: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		System.out.print("Enter second matrix: ");
		e = input.nextDouble();
		f = input.nextDouble();
		g = input.nextDouble();
		h = input.nextDouble();
		
		// Calculate all seven p's (for demonstration purposes)
		p1 = a * (f - h);
		p2 = (a + b) * h;
		p3 = (c + d) * e;
		p4 = d * (g - e);
		p5 = (a + d) * (e + h);
		p6 = (b - d) * (g + h);
		p7 = (a - c) * (e + f);
		
		// Calculate Matrix 3
		i = p5 + p4 - p2 + p6;
		j = p1 + p2;
		k = p3 + p4;
		l = p1 + p5 - p3 - p7;
		
		// Display Matrix 3
		System.out.println(df.format(i) + ", " + df.format(j) + ", " + 
			df.format(k) + ", " + df.format(l));
	}
}