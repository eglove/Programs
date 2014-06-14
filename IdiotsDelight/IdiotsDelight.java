import java.util.Scanner;

// The solitaire card game Idiot's Delight.
public class IdiotsDelight {
	
	// For reading from the console.
	public static final Scanner INPUT = new Scanner(System.in);
	
	// The four Stacks of Cards.
	private Stack<Card>[] stacks;
	
	// The Deck of Cards.
	private Deck deck;
	
	// Create and play the game.
	public static void main(String[] args) throws IllegalMoveException {
		System.out.println("Welcome to Idiot's Delight.");
		IdiotsDelight game = new IdiotsDelight();
		game.play();
	}
	
	public IdiotsDelight() {
		deck = new Deck();
		deck.shuffle();
		stacks = new Stack[4]; // This causes a compiler warning
		for(int i = 0; i < 4; i++) {
			stacks[i] = new ArrayStack<Card>();
		}
		deal();
	}
	
	// Deal one Card from the Deck onto each Stack.
	public void deal() {
		for(Stack<Card> s : stacks) {
			s.push(deck.deal());
		}
	}
	
	// Play the game.
	public void play() throws IllegalMoveException {
		while(true) {
			// Print game state
			System.out.println("\n" + this);
			// Check for victory
			boolean done = true;
			for(Stack<Card> s : stacks) {
				if(!(s.isEmpty())) {
					done = false;
					break;
				}
			}
			if(done) {
				System.out.println("You win!");
				return;
			}
			// Get command
			System.out.print("Your command (pair, suit, deal, or quit)? ");
			String command = INPUT.nextLine();
			// Handle command
			if(command.equals("pair")) {
				removePair();
			} else if(command.equals("suit")) {
				removeLowCard();
			} else if(command.equals("deal")) {
				deal();
			} else {
				return;
			}
		}
	}
	
	/*
	 * Remove the lower of two Cards of the same suit, as specified by
	 * the user.
	 */
	public void removeLowCard() throws IllegalMoveException {
		System.out.print("Location (1-4) of low card? ");
		int i = INPUT.nextInt();
		System.out.print("Location (1-4) of high card? ");
		int j = INPUT.nextInt();
		INPUT.nextLine(); // To clear out input
		stacks[i - 1].pop();
	}
	
	// Remove two Cards of the same rank, as specified by the user.
	public void removePair() throws IllegalMoveException {
		System.out.print("Location (1-4) of first card? ");
		int i = INPUT.nextInt();
		System.out.print("Location (1-4) of second card? ");
		int j = INPUT.nextInt();
		INPUT.nextLine();
		stacks[i - 1].pop();
		stacks[j - 1].pop();
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < 4; i++) {
			if(stacks[i].isEmpty()) {
				result += "-- ";
			} else {
				result += stacks[i].peek() + " ";
			}
		}
		return result + "\n" + deck.size() + " cards left in the deck";
	}
}