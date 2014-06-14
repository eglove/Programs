import java.util.Scanner;
import java.lang.*;

public class CheckPassword {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String s = input.nextLine();

		
		System.out.println(isValid(s) ? "Password is valid." : "Password is not valid.");
	}
	
	public static boolean isValid(String s) {
		
		// Atleast 8 chars, only letters and digits, atleast two digits
		if(s.length() < 8) {
			return false;
		} else {
			char c;
			int count = 0;
			for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
				if(!Character.isLetterOrDigit(c)) {
					return false;
				} else if(Character.isDigit(c)) {
					count++;
				}
			}
			
			if(count < 2)
				return false;
		}
		
		return true;
	}
}