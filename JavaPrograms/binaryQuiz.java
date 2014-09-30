import java.util.Random;
import java.util.Scanner;

public class binaryQuiz {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			int correct = addition();
			if(correct == 1) {
				System.out.println("Right!");
			} else {
				System.out.println("Nope. Try another.");
				i--; // Decrement i for wrong answers.
			}
			
			// Print current percentage
			System.out.println((i*10) + "% complete.\n");
		}
	}
	
	public static int addition() {
		// Generate two random numbers to add
		Random random = new Random();
		int r1 = random.nextInt(31);
		int r2 = random.nextInt(31);
		
		// Convert r1 & r2 to binary for asking
		String br1 = Integer.toBinaryString(r1);
		String br2 = Integer.toBinaryString(r2);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + br1 + " + " + br2 + "? ");
		int ans = input.nextInt();
		
		if(ans == r1 + r2) {
			return 1;
		} else {
			return 0;
		}
	}
}