import java.util.*;
// The card game War for two players.
public class War {
	// For reading from the Console.
	public static final Scanner INPUT = new Scanner(System.in);
	
	// Player 1's pile of Cards.
	private Queue<Card> hand1;
	
	// Player 2's pile of Cards.
	private Queue<Card> hand2;
	
	int round = 1;
	
	// Deal all the Cards out to the players.
	public War() {
		hand1 = new ArrayQueue<Card>();
		hand2 = new ArrayQueue<Card>();
		Deck deck = new Deck();
		deck.shuffle();
		while(!(deck.isEmpty())) {
			hand1.add(deck.deal());
			hand2.add(deck.deal());
		}
	}
	
	// Create and play the game.
	public static void main(String[] args) {
		System.out.println("Welcome to War.");
		War game = new War();
		game.play();
	}
	
	// Play until one player runs out of Cards.
	public void play() {
		while(!(hand1.isEmpty() || hand2.isEmpty())) {
			System.out.println("--------------------------------");
			System.out.print("\nHit return to play a round: ");
			INPUT.nextLine();
			playRound();
			if(hand1.isEmpty()) {
				System.out.println("Player 2 wins!");
			}
			if(hand2.isEmpty()) {
				System.out.println("Player 1 wins!");
			}
		}
	}
	
	// Play one round
	public void playRound() {
		Queue<Card> queue1 = new ArrayQueue<Card>();
		Queue<Card> queue2 = new ArrayQueue<Card>();
		queue1.add(hand1.remove());
		queue2.add(hand2.remove());
		do {
			Card card1 = queue1.peek();
			Card card2 = queue2.peek();
			
			// Print Round number
			System.out.println("Round " + round);
			round++;
			
			System.out.println(card1 + " " + card2);
			Queue<Card> winner = null;
			if(card1.getRank() > card2.getRank()) {
				winner = hand1;
			}
			if(card1.getRank() < card2.getRank()) {
				winner = hand2;
			}
			if(winner != null) {
				give(queue1, queue2, winner);
				return;
			}			
		} while (!settledByWar(queue1, queue2));
	}
	
	/*
	 * Play a war over stack1 and stack2. If this ends the game because
	 * one player runs out of cards, give the cards to the winning
	 * player and return true. Otherwise, return false.
	 */
	public boolean settledByWar(Queue queue1, Queue queue2) {
		System.out.println("War!");
		for(int i = 0; i < 4; i++) {
			if(hand1.isEmpty()) {
				give(queue1, queue2, hand2);
				return true;
			}
			queue1.add(hand1.remove());
			if(hand2.isEmpty()) {
				give(queue1, queue2, hand1);
				return true;
			}
			queue2.add(hand2.remove());
		}
		return false;
	}
	
	// Give all of the Cards played to the winning player.
	public void give(Queue<Card> queue1,
			Queue<Card> queue2,
			Queue<Card> winner) {
		
		if(winner == hand1) {
			System.out.println("Player 1 gets the cards");
		} else {
			System.out.println("Player 2 gets the cards");
		}
		while (!(queue1.isEmpty())) {
			winner.add(queue1.remove());
		}
		while (!(queue2.isEmpty())) {
			winner.add(queue2.remove());
		}
		
		System.out.println("Player 1 has " + hand1.size() + " cards");
		System.out.println("Player 2 has " + hand2.size() + " cards");
	}
}
