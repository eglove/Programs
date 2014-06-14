import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int value = 0;
	
		// User enter 5 numbers to be sorted
		System.out.print("Enter 5 integers: ");
		for(int i = 0; i < 5; i++) {
			value = input.nextInt();
			list.add(value);
		}
		
		// Sort list
		Collections.sort(list);
		
		System.out.println(list.toString());
	}
}