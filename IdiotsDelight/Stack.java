// A last-in, first-out stack.
public interface Stack<E> {

	// Return true if this Stack is empty.
	public boolean isEmpty();
	
	/*
	 * Return the top item on this Stack, but do not modify the Stack.
	 * @throws EmptyStructureException if this Stack is empty.
	 */
	public E peek();
	
	/*
	 * Remove and return the top item on this Stack.
	 * @throws EmptyStructureException if this STack is Empty.
	 */
	public E pop();
	
	// Add target to the top of the Stack.
	public void push(E target);
}
