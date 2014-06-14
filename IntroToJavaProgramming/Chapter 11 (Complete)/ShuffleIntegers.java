import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < 10; i++) {
			int n = input.nextInt();
			list.add(n);
		}
		
		// Sort list
		shuffle(list);
		
		// Display list
		for(int j = 0; j < list.size(); j++)
			System.out.print(list.get(j) + " ");
	}
	
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}
}