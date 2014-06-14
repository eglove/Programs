/* Write a program that plays the popular scissor-rock-paper game. (A scissor 
 * can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, 
 * rock, and paper. The program prompts the user to enter a number 0, 1, or 2 
 * and displays a message indicating whether the user of the computer wins, 
 * loses, or draws. Here are sample runs:
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won.
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw.
 */
import java.util.Scanner;

public class ScissorRockPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int comp = (int)(Math.random() * 3);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();
		
		if(user == comp) {
			System.out.println("The computer is " + string(comp) + ". You are "
				+ string(user) + " too. It is a draw.");
		}
		else if(user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2
			&& comp == 0) {
			System.out.println("The computer is " + string(comp) + ". You are "
				+ string(user) + ". You lose.");
		} else {
			System.out.println("The computer is " + string(comp) + ". You are "
				+ string(user) + ". You win!");
		}
	}
	
	public static String string(int num) {
		if(num == 0)
			return "scissor";
		else if(num == 1)
			return "rock";
		else
			return "paper";
	}
}