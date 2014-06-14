// Standard deck of 52 playing cards.
public class Deck {
	
	// The cards in this Deck.
	private Card[] cards;
	
	// Number of the Cards currently in this Deck.
	private int size;
	
	// Create all 52 Cards, in order.
	public Deck() {
		cards = new Card[52];
		size = 0;
		for(int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for(int rank = Card.ACE; rank <= Card.KING; rank++) {
				cards[size] = new Card(rank, suit);
				size += 1;
			}
		}
	}
	
	// Return true if the Deck contains no Cards.
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Return the number of Cards currently in the Deck.
	public int size() {
		return size;
	}
	
	public Card deal() {
		size--;
		return cards[size];
	}
	
	// Randomly rearrange the Cards in the Deck.
	public void shuffle() {
		for(int i = size - 1; i > 0; i--) {
			swap(i, (int)(Math.random() * (i + 1)));
		}
	}
	
	// Swap the Cards at indices i and j.
	protected void swap(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
}
