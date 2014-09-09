import java.util.Scanner;

public class recursiveExponent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		int base = input.nextInt();
		System.out.print("Enter exponent: ");
		int exponent = input.nextInt();
		
		System.out.println(exponent(base,exponent));
	}
	
	public static int exponent(int b, int e) {
		if (e == 0)
			return 1;
		else
			return b * exponent(b, e-1);
	}
}