// A linked queue.
public class LinkedQueue<E> implements Queue<E> {

	// The front ListNode in the Queue.
	private ListNode<E> front;
	
	// The back ListNode in the Queue.
	private ListNode<E> back;
	
	private E[] data;
	private int size;
	
	// The Queue is initially empty.
	public LinkedQueue() {
		front = null;
		back = null;
		data = (E[])(new Object[1]);
		size = 0;
	}
	
	public void add(E target) {
		ListNode<E> node = new ListNode<E>(target);
		if(isEmpty()) {
			front = node;
			back = node;
			size++;
		} else {
			back.setNext(node);
			back = node;
			size++;
		}
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new EmptyStructureException();
		}
		E result = front.getItem();
		front = front.getNext();
		size--;
		return result;
	}

	public E peek() {
		if(isEmpty()) {
			throw new EmptyStructureException();
		}
		return data[size - 1];
	}

	public int size() {
		return size;
	}
}
