import java.util.Scanner;

public class StringReplace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Enter string: ");
		StringBuilder s = new StringBuilder(input.nextLine());
		
		for(int i = 0, n = s.length(); i < n; i++) {
			if(s.charAt(i) == ' ') {
				s.setCharAt(i, '-');
				count++;
			}
		}
		
		System.out.println(s);
		System.out.println(count);
	}
}