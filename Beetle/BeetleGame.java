// The game of Beetle for num players
public class BeetleGame {

	public static final java.util.Scanner
	INPUT = new java.util.Scanner(System.in);
	
	// Beetle array
	private Beetle[] beetleList = new Beetle[9];
	// A die
	private Die die;
	
	// Create the die and Beetles.
	public BeetleGame(int num) {
		for(int i = 0; i <= num; i++) {
			beetleList[i] = new Beetle();
		}
		die = new Die();
	}
	
	// Create the game
	public static void main(String[] args) {
		System.out.println("Welcome to Beetle.");
		System.out.println("How many players? (2-8)");
		int num = INPUT.nextInt();
		BeetleGame game = new BeetleGame(num);
		game.play(num);
	}
	
	// Play until someone wins
	public void play(int num) {
		int player = 1;
		Beetle bug = beetleList[0];
		
		while(!(bug.isComplete())) {
			if(!(takeTurn(player, bug))) {
				// If player gets to max reset to take turn
				if(player != num) {
					player += 1;
				} else {
					player = 1;
				}
				
				// If bug gets to top of list, reset to 0
				if(bug != beetleList[num]) {
					bug = beetleList[+ 1];
				} else {
					bug = beetleList[0];
				}
			}
		}
		
		System.out.println("\nPlayer " + player + " wins!");
		System.out.print(bug + "\n");
		System.out.println("Do you want to play again? (yes/no): ");
			if(INPUT.nextLine().equals("yes")){
				System.out.println("How many players? (2-8)");
				int num2 = INPUT.nextInt();
				BeetleGame game = new BeetleGame(num2);
				game.play(num2);			
			}
	}
	
	public boolean takeTurn(int player, Beetle bug) {
		System.out.println("\nPlayer " + player + ", your beetle:");
		System.out.println(bug);
		System.out.println("####################");
		System.out.print("\nHit return to roll: ");
		INPUT.nextLine();
		die.roll();
		System.out.println("You rolled a " + die.getTopFace());
		System.out.println("Roll count: " + bug.getRollCount());
		switch(die.getTopFace()) {
		case 1:
			System.out.println(" (body)");
			return bug.addBody();
		case 2:
			System.out.println(" (head)");
			return bug.addHead();
		case 3:
			System.out.println(" (leg)");
			return bug.addLeg();
		case 4:
			System.out.println(" (eye)");
			return bug.addEye();
		case 5:
			System.out.println(" (feeler)");
			return bug.addFeeler();
		default:
			System.out.println(" (tail)");
			return bug.addTail();
		}
	}
}
