import java.util.Scanner;

public class TheMadKing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many times do you want to run? ");
		int run = input.nextInt();
		
		for(int i = 0; i < run; i++) {
			// King lines up 100 wise men and place red or blue hats on them.
			// 0 = Red, 1 = Blue
			int[] wiseMen = new int[100];
			wiseMen = fillArray(wiseMen);
			
			// Wise man 1 (index 0) counts red hats in front of him
			int redHats = countRedHats(wiseMen, 1);
			
			/* Wise man 1 (index 0) signals odd or even  red hats to others
			 * If it's even, he says red, it it's odd, he says blue.
			 * Wise man 1 has random chance of surviving.
			 */
			int flag = wiseManOne(redHats, wiseMen);
			
			/* Each wise man counts the number of red hats in front of him, if
			 * it has not changed from even to odd, or odd to even, they say the 
			 * color the man behind them said, if not, they say the opposite.
			 */
			getAnswer(wiseMen, flag, redHats);
		}
	}
	
	// Check if wise man is still alive alive
	private static int[] checkAlive(int real, int choice, int i, int[] a) {
		if(choice != real)
			a[i] = -1;
			
		return a;
	}
	
	// Count red hats in front of start (current wise man)
	private static int countRedHats(int[] a, int start) {
		int n = 0;
		for(int i = start; i < a.length; i++) {
			if(a[i] == 0)
				n++;
		}
		
		return n;
	}
	
		// Wise man says initial color, flags it
	private static int wiseManOne(int redHats, int[] wiseMen) {
		int flag;
		if(redHats % 2 == 0) {
			flag = 0; // The signal (0 = even)
			if(wiseMen[0] == 1) {
				wiseMen[0] = -1; // Dies if wrong about himself.
			}
		}
		else {
			flag = 1; // The signal (1 = odd)
			if(wiseMen[0] == 0) {
				wiseMen[0] = -1; // Dies if wrong about himself.
			}
		}
		
		return flag;
	}
	
	private static void getAnswer(int[] wiseMen, int flag, int redHats) {
		int alive = 0, count = 0, flag2 = 0;
	
		for(int i = 1; i < wiseMen.length; i++) {
			// Current wiseMan (i) counts red hats in front of him
			count = countRedHats(wiseMen, i + 1);
			if(count % 2 == 0)
				flag2 = 0;
			else
				flag2 = 1;
				
			if(flag == flag2) { // If new count same as last
				if(wiseMen[i] == 0) {
					checkAlive(0, wiseMen[i], i, wiseMen);
				}
				else {
					checkAlive(1, wiseMen[i], i, wiseMen);
				}
			}
			else { // Count is different than redHats
				if(wiseMen[i] == 1) { // Yell opposite
					checkAlive(1, wiseMen[i], i, wiseMen);
				}
				else {
					checkAlive(0, wiseMen[i], i, wiseMen);
				}
			}
			
			redHats = count; // Set new redHats
			count = 0; // Reset count
		}
		
		// How many wise men are alive.
		for(int i = 0; i < wiseMen.length; i++) {
			if(wiseMen[i] != -1)
				alive++;
		}
		System.out.println(alive + " wise men alive.");
	}
	
	// Fill array with random 0 or 1
	private static int[] fillArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 2);
		}
		
		return a;
	}
}