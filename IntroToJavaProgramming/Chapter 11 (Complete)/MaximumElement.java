import java.util.Scanner;
import java.util.ArrayList;

public class MaximumElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		// User enter numbers ending in 0
		System.out.println("Enter a sequence of numbers ending in 0: ");
		
		int  value;
		do {
			value = input.nextInt();
			
			if(value != 0) {
				list.add(value);
			}
		} while(value != 0);
		
		System.out.print("Max value is: " + max(list));		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if(list == null || list.size() == 0)
			return null;
		
		
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		
		return max;
	}
}