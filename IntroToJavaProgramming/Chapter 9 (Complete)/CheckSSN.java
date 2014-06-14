import java.util.Scanner;

public class CheckSSN {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter SSN e.g., DDD-DD-DDDD: ");
		String s = input.nextLine();
		
		System.out.println(isValid(s) ? "SSN is valid." : "SSN is not valid.");
	}
	
	public static boolean isValid(String s) {
		return s.matches("\\d{3}-\\d{2}-\\d{4}");
	}
}