/* Write a program that receives an ASCII code (an integer between 0 and 127)
 * and displays its character. For example, if the user enters 97, the program
 * displays character a. Here is a sample run:
 * Enter an ASCII code: 69
 * The character is E.
 */
import java.util.Scanner;

public class CharacterOfAnAsciiCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int num = input.nextInt();
		
		String ascii = Character.toString((char) num);
		System.out.println("The character is " + ascii + ".");
	}
}