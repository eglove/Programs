public class BinaryListings {
	public boolean search(E element) {
		TreeNode<E> current = root; // Start from the root
	
		while(current != null)
			if(element < current.element) {
				current = current.left; // Go left
			} else if(element > current.element) {
				current = current.right; // Go right
			} else { // Element matches current.element
				return true; // Element is found
			}
		
			return false; // Element is not in the tree
	}
	
	boolean insert(E e) {
		if(tree is empty)
			// Create the node for e as the root;
		else {
			// Locate the parent node
			parent = current = root;
			while(current != null)
				if(e < the value in the current.element) {
					parent = current; // Keep the parent
					current = current.left; // Go left
				} else if(e > the value in current.element) {
					parent = current; // Keep the parent
					current = current.right; // Go right
				} else
					return false; // Duplicate node not inserted
					
			// Create a new node for e and attach it to parent
			
			return true; // Element inserted
		}
	}
}