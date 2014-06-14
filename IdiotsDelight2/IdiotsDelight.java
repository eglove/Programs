import java.util.Scanner;

import javax.management.RuntimeErrorException;

// The solitaire card game Idiot's Delight.
public class IdiotsDelight {
	
	// For reading from the console.
	public static final Scanner INPUT = new Scanner(System.in);
	
	// The four Stacks of Cards.
	private Stack<Card>[] stacks;
	
	// The Deck of Cards.
	private Deck deck;
	
	// Create and play the game.
	public static void main(String[] args) throws IllegalMoveException 
	{
		System.out.println("Welcome to Idiot's Delight");
		System.out.print("How many stacks would you like on the table?: ");
		int stackCount = -1;
		try
		{
			stackCount = Integer.parseInt(INPUT.nextLine());
		}
		catch(NumberFormatException ex)
		{
			stackCount = -1;
		}
		if(stackCount <= 0)
		{
			System.err.println("Error: You need at least one stack to play");
			return;
		}
		
		IdiotsDelight game = new IdiotsDelight(stackCount);
		game.play();
	}
	
	public IdiotsDelight(int numberOfStacks) 
	{
		deck = new Deck();
		deck.shuffle();
		stacks = new Stack[numberOfStacks]; // This causes a compiler warning
		for(int i = 0; i < stacks.length; i++) 
		{
			stacks[i] = new ArrayStack<Card>();
		}
		deal();
	}
	
	// Deal one Card from the Deck onto each Stack.
	public void deal() 
	{
		for(Stack<Card> s : stacks) 
		{
			if(deck.isEmpty())
			{
				throw new RuntimeException("You picked too many stacks. There aren't enough cards in the deck!.\n"+
												"Restart the game and pick a lower number of stacks");
			}
			s.push(deck.deal());
		}
	}
	
	// Play the game.
	public void play() throws IllegalMoveException 
	{
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
			boolean isValidCommand = false;
			while(!isValidCommand)
			{
				System.out.print("Your command (pair, suit, deal, move, or quit)? ");
				String command = INPUT.nextLine();
				// Handle command
				if(command.equalsIgnoreCase("pair")) 
				{
					removePair();
					isValidCommand = true;
				} 
				else if(command.equalsIgnoreCase("suit")) 
				{
					removeLowCard();
					isValidCommand = true;
				} 
				else if(command.equalsIgnoreCase("deal")) 
				{
					deal();
					isValidCommand = true;
				} 
				else if(command.equalsIgnoreCase("move"))
				{
					move();
					isValidCommand = true;
				}
				else 
				{
					System.err.println("Error, that is not a valid command. Please try again");
				}	
			}
			
			
		}
	}
	
	/*
	 * Remove the lower of two Cards of the same suit, as specified by
	 * the user.
	 */
	public void removeLowCard() throws IllegalMoveException 
	{
		int i = -1;
		int j = -1;
		while((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length) || i==j)
		{
			System.out.print("Location (1-" + stacks.length +") of low card? ");
			i = INPUT.nextInt();
			System.out.print("Location (1-" + stacks.length +") of high card? ");
			j = INPUT.nextInt();
			INPUT.nextLine(); // To clear out input	
			
			if((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length))
			{
				System.err.println("Error, invalid location. Try again");
			}
			if(i==j)
			{
				System.err.println("Error. You cannot select the same card. Try again");
			}
		}
		
		stacks[i - 1].pop();
	}
	
	public void move() throws IllegalMoveException 
	{
		int i = -1;
		int j = -1;
		while((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length) || i==j)
		{
			System.out.print("Location (1-" + stacks.length +") of top card? ");
			i = INPUT.nextInt();
			System.out.print("Location (1-" + stacks.length +") to move to? ");
			j = INPUT.nextInt();
			INPUT.nextLine(); // To clear out input	
			
			if((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length))
			{
				System.err.println("Error, invalid location. Try again");
			}
			if(i==j)
			{
				System.err.println("Error. You cannot select the same card. Try again");
			}
		}
		
		if(stacks[i-1].isEmpty())
		{
			System.err.println("Error. Selected stack is empty. There's no high card");
			return;
		}
		
		stacks[j-1].push(stacks[i-1].pop());
	}
	
	// Remove two Cards of the same rank, as specified by the user.
	public void removePair() throws IllegalMoveException 
	{
		int i = -1;
		int j = -2;
		while((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length) || i==j)
		{
			System.out.print("Location (1-" + stacks.length +") of first card? ");
			i = INPUT.nextInt();
			System.out.print("Location (1-" + stacks.length +") of second card? ");
			j = INPUT.nextInt();	
			
			if((i<=0 || i>stacks.length) || (j<=0 || j>stacks.length))
			{
				System.err.println("Error, invalid location. Try again");
			}
			if(i==j)
			{
				System.err.println("Error. You cannot select the same card. Try again");
			}
		}
		
		INPUT.nextLine();
		stacks[i - 1].pop();
		stacks[j - 1].pop();
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < stacks.length; i++) {
			if(stacks[i].isEmpty()) {
				result += "-- ";
			} else {
				result += stacks[i].peek() + " ";
			}
		}
		return result + "\n" + deck.size() + " cards left in the deck";
	}
}