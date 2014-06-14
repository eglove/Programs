import java.util.Scanner;

public class CountLettersInString {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		System.out.println("There are " + countLetters(s) + " characters in the string.");
	}
	
	public static int countLetters(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
}