import java.util.Scanner;

/** The card game BeggarMyNeighbor for two players. */
public class BeggarMyNeighbor {

  /** For reading from the Console. */
  public static final Scanner INPUT = new Scanner(System.in);
  
  /** Player 1's pile of Cards. */
  private Queue<Card> hand1;

  /** Player 2's pile of Cards. */
  private Queue<Card> hand2;

  private int round;

  /** Deal all the Cards out to the players. */
  public BeggarMyNeighbor() {
    hand1 = new LinkedQueue<Card>();
    hand2 = new LinkedQueue<Card>();
    Deck deck = new Deck();
    deck.shuffle();
    while (!(deck.isEmpty())) {
      hand1.add(deck.deal());
      hand2.add(deck.deal());
    }
    round = 0;
  }

  /** Give all of the Cards played to the winning player. */
  public void give(Queue<Card> queue,
                   Queue<Card> winner) {
    if (winner == hand1) {
      System.out.println("Player 1 gets the cards");
    } else {
      System.out.println("Player 2 gets the cards");
    }
    while (!(queue.isEmpty())) {
	  winner.add(queue.remove());
    }
  }

  /** Play until one player runs out of Cards. */
  public void play() {
    int player = 1;
    while (!(hand1.isEmpty() || hand2.isEmpty())) {
      System.out.print("\nHit return to play round: ");
      INPUT.nextLine();
      player = playRound(player);
      round++;
      System.out.println("End of Round "+round);
      System.out.println("Player 1 has "+hand1.size()+" cards");
      System.out.println("Player 2 has "+hand2.size()+" cards");
      if (hand1.isEmpty()) {
        System.out.println("Player 2 wins!");
      }
      if (hand2.isEmpty()) {
        System.out.println("Player 1 wins!");
      }
    }
  }

  /** Play one round. */
  public int playRound(int player) {
    Queue<Card> queue = new LinkedQueue<Card>();
    Queue<Card> hand;
    Card card = new Card(Card.ACE, Card.SPADES);
    boolean done;
    if (player == 1) hand = hand1;
    else hand = hand2;
        
 
    while (!(hand.isEmpty())) {
      card = hand.remove();
      queue.add(card);
      System.out.print("Player " + player + " plays " + card);
      System.out.print(" --- Hit return to continue");
      INPUT.nextLine();
      if (hand == hand1) {
        hand = hand2;
        player = 2;
      } else {
        hand = hand1;
        player = 1;
      }
      if (card.getRank() >= Card.JACK) break;
    } 

    done = false;
    while (!(hand.isEmpty()) && !(done)) {
      for (int i=card.getRank(); i>=Card.JACK && !(hand.isEmpty()); i--) {
        card = hand.remove();
        queue.add(card);
        System.out.print("Player " + player + " plays " + card);
        System.out.print(" --- Hit return to continue");
        INPUT.nextLine();
        if (card.getRank() >= Card.JACK) {      
          if (hand == hand1) {
            hand = hand2;
            player = 2;
          } else {
            hand = hand1;
            player = 1;
          }
          break;
        }
      }
      if (card.getRank() <= Card.TEN) done = true;
    } 
   
    if (hand == hand1) {
      give(queue,hand2);
      return 2;
    } else {
      give(queue,hand1);
      return 1;
    }
        
  }


  /** Create and play the game. */
  public static void main(String[] args) {
    System.out.println("Welcome to BeggarMyNeighbor.");
    BeggarMyNeighbor game = new BeggarMyNeighbor();
    game.play();
  }
  
}