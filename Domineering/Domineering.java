import java.util.InputMismatchException;

// The game of Domineering
public class Domineering {
	// Array of board squares, true if occupied
	private boolean[][] squares;
	// For reading from the console
	public static final java.util.Scanner INPUT
		= new java.util.Scanner(System.in);
	// The player who plays their dominoes horizontally
	public static final boolean HORIZONTAL = false;
	// The player who plays their dominoes vertically
	public static final boolean VERTICAL = true;
	// The board is initially empty
	public Domineering(int rows, int columns) {
		squares = new boolean[rows][columns]; // Java initializes all array elements to false
	}
	
	// Create and play the game
	public static void main(String[] args) {
		int row, column;
		System.out.println("Welcome to Domineering.");
		row = Integer.parseInt(args[0]);
		column = Integer.parseInt(args[1]);
		
		// Set default to 8 if user does not input
		if(row == 0) {
			row = 8;
		}
		if(column == 0) {
			column = 8;
		}
		
		Domineering game = new Domineering(row, column);
		game.play();
	}
	
	public String toString() {
		String result = "  ";
		for(int i = 0; i < squares[0].length; i++) {
			result += (i + " ");
		}
		
		for(int row = 0; row < squares.length; row++) {
			result += "\n" + row;
			for(int column = 0; column < squares[0].length; column++) {
				if(squares[row][column]) {
					result += " #";
				} else {
					result += " .";
				}
			}
		}
		return result;
	}
	
	// Play until someone wins
	public void play() {
		boolean player = HORIZONTAL;
		boolean errorStat = true;		
		while(errorStat) {
			try { // Check for error in input
				while(true) {
					System.out.println("\n" + this);
					if(player == HORIZONTAL) {
						System.out.println("Horizontal to play");
					} else {
						System.out.println("Vertical to play");
					}
					if(!(hasLegalMoveFor(player))) {
						System.out.println("No legal moves -- you lose!");
						return;
					}
					System.out.print("Row Column: ");
					int row = INPUT.nextInt();
					int column = INPUT.nextInt();
					
					// Check if move is valid
					if(isMoveValid(row, column, player)) {
						playAt(row, column, player);
						player = !player;
						errorStat = false;
					} else {
						System.err.print("Invalid Move - Try Again!");
						errorStat = true;
					}
				}
			} catch (Exception e) {
				System.err.print("Invalid Move - Try Again!\n");
				INPUT.next(); INPUT.next();
				errorStat = true;
			}
		}
	}
	
	// Play a domino with its upper left corner at row, column.
	public void playAt(int row, int column, boolean player) {
		squares[row][column] = true;
		if(player == HORIZONTAL) {
			squares[row][column + 1] = true;
		} else {
			squares[row + 1][column] = true;
		}
	}
	
	// Return true if there is a legal move for the specified player
	public boolean hasLegalMoveFor(boolean player) {
		int rowOffset = 0;
		int columnOffset = 0;
		if(player == HORIZONTAL) {
			columnOffset = 1;
		} else {
			rowOffset = 1;
		}
		for(int row = 0; row < (squares.length - rowOffset); row++) {
			for(int column = 0; column < (squares[0].length - columnOffset); column++) {
				if(!(squares[row + rowOffset][column + columnOffset])) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isMoveValid(int row, int column, boolean player) {
		if(row > squares.length || row < 0) {
			return false;
		}
		else if(column > squares[0].length || column < 0) {
			return false;
		}
		
		if(player) { // Check vertical
			if(squares[row][column] || squares[row + 1][column]) {
				return false;
			} else {
				return true;
			}
		} else { // Check horizontal
			if(squares[row][column] || squares[row][column + 1]) {
				return false;
			}
				return true;
		}
	}
}