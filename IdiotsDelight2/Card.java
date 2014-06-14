// A playing card
public class Card {
	
	// Number of face on this Card.
	private int rank;
	// Suit of this card.
	private int suit;
	
	// Initialize the rank and suit.
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	// Return the rank of this Card.
	public int getRank() {
		return rank;
	}
	
	// Return the suit of this Card.
	public int getSuit() {
		return suit;
	}
	
	// Suit of spades.
	public static final int SPADES = 0;
	// Suit of hearts.
	public static final int HEARTS = 1;
	// Suit of diamonds.
	public static final int DIAMONDS = 2;
	// Suit of clubs.
	public static final int CLUBS = 3;
	// Rank of ace, equivalent to 1.
	public static final int ACE = 14;
	// Rank of jack.
	public static final int JACK = 11;
	// Rank of queen.
	public static final int QUEEN = 12;
	// Rank of king.
	public static final int KING = 13;
	
	/* 
	 * Return true if and only if that Card has the same rank as
	 * this one. Suit is ignored.
	 */
	public boolean equals(Object that) {
		if(this == that) {
			return true;
		}
		if(that == null) {
			return false;
		}
		if(getClass() != that.getClass()) {
			return false;
		}
		Card thatCard = (Card)that;
		return rank == thatCard.rank;
	}
	
	public String toString() {
		return "" + "-23456789TJQKA".charAt(rank) + "shdc".charAt(suit);
	}
}
