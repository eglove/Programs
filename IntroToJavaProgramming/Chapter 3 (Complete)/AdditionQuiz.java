/* Listing 3.4, SubtractionQuiz.java, randomly generates a subtraction question.
 * Revise the program to randomly generate an addition question with two
 * integers less than 100.
 */
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		// 1. Generate two random single-digit integers
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		// 3. Prompt the student to answer "What is number1 + number2?"
		System.out.print
			("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// 4. Grade the answer and display the result
		if(number1 + number2 == answer)
			System.out.println("You are correct!");
		else
			System.out.println("Your answer is wrong.\n" + number1 + " + "
				+ number2 + " is " + (number1 + number2));
	}
}