/* Write a program that simulates picking a card from a deck of 52 cards. Your 
 * program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, 
 * Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. Here is 
 * a sample run of the program:
 * The card you picked is Jack of Hearts
 */

public class PickACard {
	public static void main(String[] args) {
		int rank = (int)(Math.random() * 13 + 1);
		int suit = (int)(Math.random() * 4 + 1);
		
		System.out.print("The card you picked is ");
		
		switch(rank) {
			case 1: System.out.print("Ace of "); break;
			case 2: System.out.print("2 of "); break;
			case 3: System.out.print("3 of "); break;
			case 4: System.out.print("4 of "); break;
			case 5: System.out.print("5 of "); break;
			case 6: System.out.print("6 of "); break;
			case 7: System.out.print("7 of "); break;
			case 8: System.out.print("8 of "); break;
			case 9: System.out.print("9 of "); break;
			case 10: System.out.print("10 of "); break;
			case 11: System.out.print("Jack of "); break;
			case 12: System.out.print("Queen of "); break;
			case 13: System.out.print("King of "); break;
		}
		
		switch(suit) {
			case 1: System.out.print("Clubs"); break;
			case 2: System.out.print("Diamonds"); break;
			case 3: System.out.print("Hearts"); break;
			case 4: System.out.print("Spades");
		}		
	}
}