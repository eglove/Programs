import java.util.*;

public class InsertedSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		
		// Fill list with  10 random numbers
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100));
		}
		
		// Sort list
		Collections.sort(list);
		printList(list);
		
		// Get user number
		System.out.println();
		System.out.print("Enter number: ");
		int n = input.nextInt();
		
		// Insert input into list
		insertInput(list, n);
	}
	
	// Print list
	public static void printList(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	// Insert input into list, display
	public static void insertInput(List<Integer> list, int n) {
		int lo = 0, mid = 0, hi = list.size() - 1;
		while(lo <= hi) {
			mid = lo + (hi - lo)/2;
			if(n < list.get(mid))
				hi = mid - 1;
			else if(n > list.get(mid))
				lo = mid + 1;
			else
				break;
		}
		
		list.add(mid, n);
		printList(list);
	}
}