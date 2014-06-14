/* Write a program that lets the user guess whether the flip of a coin results 
 * in heads or tails. The program randomly generates an integer 0 or 1, which 
 * represents head or tail. The program prompts the user to enter a guess and 
 * reports whether the guess is correct or incorrect.
 */
import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double rand = (Math.random() * 1);
		double flip = Math.round(rand);
		
		System.out.print("Guess heads or tails (enter 0 or 1): ");
		int guess = input.nextInt();
		
		if(guess == 0)
			System.out.println("Your guess is heads.");
		else
			System.out.println("Your guess if tails.");
			
		if(flip == 0)
			System.out.println("Flip is heads.");
		else
			System.out.println("Flip is tails.");
		
		if(guess == flip)
			System.out.println("You're right!");
		else
			System.out.println("You're wrong. :(");
	}
}