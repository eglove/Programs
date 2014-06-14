import java.util.*;

public class SumList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list =  new ArrayList<Integer>();
		int value = 0;
		
		// User enters 5 numbers
		System.out.print("Enter 5 integers: ");
		for(int i = 0; i < 5; i++) {
			value = input.nextInt();
			list.add(value);
		}
		
		// Sums list
		int total = 0;
		for(int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		
		// Display
		System.out.println(total);
	}
}