import java.util.LinkedList;

public class MiddleElement {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int count = 0; // For printing list [testing]
		
		// Get random length for list, fill with random integers
		int len = (int)(Math.random() * 50);
		System.out.println(len); // Print length of list [testing]
		for(int i = 0; i < len; i++) {
			list.add((int)(Math.random() * 100));
			
			// Print out of list [testing]
			System.out.print(list.get(i) + " ");
			count++;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
			// [testing]
		}
		
		// Return middle element
		int mid = len / 2;
		System.out.println();
		System.out.println(list.get(mid));
	}
}