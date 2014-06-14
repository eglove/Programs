import java.util.Scanner;
import java.io.*;

// The game of Questions.
public class Questions {
	
	// For reading from console
	public static final Scanner INPUT = new Scanner(System.in);
	
	// Root of the decision tree.
	private BinaryNode<String> root;
	
	/* Initially, the program guesses that the player is thinking of
	 * a giraffe.
	 */
	public Questions() {
		root = new BinaryNode<String>("a giraffe");
	}
	
	// Create and repeatedly play the game.
	public static void main(String[] args) {
		Questions game = new Questions();
		
		System.out.println("Welcome to Questions.");
		do {
			System.out.println();
			game.play();
			System.out.print("Play again (yes or no)? ");
		} while (INPUT.nextLine().equals("yes"));
	}
	
	// Play until the programs wins or gives up.
	public void play() {
		BinaryNode<String> node = root;
		while(!(node.isLeaf())) {
			System.out.print(node.getItem() + " ");
			if(INPUT.nextLine().equals("yes")) {
				node = node.getLeft();
			} else {
				node = node.getRight();
			}
		}
		System.out.print("Is it ... " + node.getItem() + "? ");
		if(INPUT.nextLine().equals("yes")) {
			System.out.println("I win!");
		} else {
			System.out.println("I give up.");
			learn(node);
		}
	}
	
	/* Node is a leaf corresponding to an incorrect guess. Gather
	 * information from the user and add to children to node. */
	protected void learn(BinaryNode<String> node) {
		System.out.print("What is it? ");
		String correct = INPUT.nextLine();
		System.out.println("I need a question to distinguish that from "
			+ node.getItem() + ".");
		System.out.println("The answer for " + correct
			+ " should be yes.");
		System.out.print("Enter the question: ");
		String question = INPUT.nextLine();
		node.setLeft(new BinaryNode<String>(correct));
		node.setRight(new BinaryNode<String>(node.getItem()));
		node.setItem(question);
	}
	
	/* Return a String representation of the tree rooted at this node,
	 * traversed inorder. */
	 public String toSTringInorder() {
		String result = "";
		if(left != null) {
			result += left.toStringInorder();
		}
		
		result += item;
		if(right != null) {
			result += right.toStringInorder();
		}
		return result;
	 }
}