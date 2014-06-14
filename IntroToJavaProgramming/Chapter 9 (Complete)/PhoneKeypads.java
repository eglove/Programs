import java.util.Scanner;

public class PhoneKeypads {
	public static void main(String[] args) {
	
		StringBuilder sB = new StringBuilder();
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				System.out.print(getNumber(s.charAt(i)));
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
	
	public static int getNumber(char uppercaseLetter) {
		
		uppercaseLetter = Character.toUpperCase(uppercaseLetter);
		
		if(uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			return 2;
		} else if(uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			return 3;
		} else if(uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			return 4;
		} else if(uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			return 5;
		} else if(uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			return 6;
		} else if(uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S') {
			return 7;
		} else if(uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			return 8;
		} else {
			return 9;
		}
	}
}