import java.util.Scanner;

public class OccurrencesOfChar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a siring: ");
		String s = input.nextLine();
		System.out.print("Enter a character: ");
		char c = input.nextLine().charAt(0);
		
		System.out.println(c + " appears " + count(s, c) + " time(s).");
	}
	
	public static int count(String s, char c) {
		int count = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
				count++;
		}
		
		return count;
	}
}