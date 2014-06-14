/* Write a program that generates two integers under 100 and prompts the user to
 * enter the sum of these two integers. The program then reports true if the
 * answer is correct, false otherwise. The program is similar to Listing 3.1.
 */
import java.util.Scanner;

public class LearnAddition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		if(answer == (number1 + number2)) {
			System.out.println("Correct!");
		}else{
			System.out.println("Sorry, " + number1 + " + " + number2 + " = " +
				(number1 + number2));
		}
	}
}