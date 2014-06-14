import java.util.Scanner;

public class CheckSubstring {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string1: ");
		String s1 = input.nextLine();
		System.out.print("Enter string2: ");
		String s2 = input.nextLine();
		
		System.out.println(isIndex(s1,s2) ? "String 1 is a substring of String 2" :
			"String 1 is not a substring of String 2");
	}
	
	public static boolean isIndex(String s1, String s2) {
		if(s2.indexOf(s1) < 0)
			return false;
		else
			return true;
	}
}