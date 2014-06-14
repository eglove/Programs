// As list of elements.
public interface List<E> extends Iterable<E> {
	// Add target to the back of this list.
	public void add(E target);
	
	// Return true if some item in this List equals() target.
	public boolean contains(E target);
	
	// Return the indexth element of this List.
	public E get(int index);
		
	// Return true if this List is empty.
	public boolean isEmpty();
		
	/* 
	 * Remove and return the indexth element from this List, shifting
	 * all later items one place left.
	 */
	public boolean remove(E target);
	
	// Replace the indexth element of this List with target.
	public void set(int index, E target);
		
	// Return the number of element in this List.
	public int Size();
}