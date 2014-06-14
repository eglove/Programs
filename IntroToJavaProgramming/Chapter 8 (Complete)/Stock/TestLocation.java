import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		Location in = new Location(row, column);
		
		in.locateLargest();
	}
}