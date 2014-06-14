import java.util.Scanner;

public class OccurrencesOfEachDigit {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 10 digit string: ");
		String string = input.nextLine();
		
		int[] counts = new int[10];
		counts = count(counts, string);
		
		display(counts, string);
	}
	
	public static int[] count(int[] counts, String s) {
		char c;
		int count = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			for(int j = 0; j < s.length(); j++) {
				if(c == s.charAt(j))
					counts[i]++;
			}
		}
		
		return counts;
	}
	
	public static void display(int[] counts, String s) {
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println("Character " + s.charAt(i) + " appears " + counts[i] + 
				((counts[i] > 1) ? " times." : " time."));
		}
	}
}