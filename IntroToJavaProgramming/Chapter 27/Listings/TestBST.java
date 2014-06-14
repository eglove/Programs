import java.io.*;
import java.util.*;

public class TestBST {
	public static void main(String[] args) {
		// Create a BST
		BST<String> tree = new BST<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		
		// Traverse tree
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nThe number of nodes is " + tree.getSize());
		
		// Search for an element
		System.out.print("\nIs Peter in the tree? " +
			tree.search("Peter"));
			
		// Get a path from the root to Peter
		System.out.print("\nA path from the root to Peter is: ");
		java.util.ArrayList<BST.TreeNode<String>> path
			= tree.path("Peter");
		for(int i = 0; path != null && i < path.size(); i++)
			System.out.print(path.get(i).element + " ");
			
		Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
		BST<Integer> intTree = new BST<Integer>(numbers);
		System.out.print("\nInorder (sorted): ");
		intTree.inorder();
		
		Integer[] integers = new Integer[10];
		BST<Integer> numTree = new BST<Integer>(integers);
		int j = 0;		
		
		try{
			Scanner scan = new Scanner(new File("input"));
			while(scan.hasNextInt()) {
				integers[j] = scan.nextInt();
				j++;
		}
		scan.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("\n List inorder: ");
		numTree.inorder();
	}
}