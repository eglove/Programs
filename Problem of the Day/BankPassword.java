/* The problem goes like this. A user is asked to create a password that is 7 
 * digits where none of the numbers can repeat. In addition to this requirement 
 * none of the numbers can be in a direct sequence (6 and 7, 7 and 6, or 9 
 * and 0). Create a program to generate a random password for this bank that 
 * fits their rule set.
 */
import java.util.Random;

public class BankPassword {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			newPass();
			System.out.println();
		}
	}
	
	public static void newPass() {
		int[] pass = new int[7];
		Random rand = new Random();
		
		// Fill original password
		for(int i = 0; i < pass.length; i++)
			pass[i] = rand.nextInt(9);
			
		// Compare each element to rest of list
		for(int i = 0; i < pass.length; i++)
			pass = compare(i, pass);
			
		// Print pass
		for(int i = 0; i < pass.length; i++)
			System.out.print(pass[i] + " ");
	}
	
	public static int[] compare(int n, int[] list) {
		// Compare list w/ n
		Random rand = new Random();
		
		int i = 0;
		while(i < list.length) {
			// Check if list[n] == list[i], skip if same element
			if(list[i] == list[n] && i != n) {
				list[i] = rand.nextInt(10);
				i = 0;
			// Check for sequence
			} else if(list[i] == list[i] + 1 || list[i] == list[i] - 1) {
				list[i] = rand.nextInt(10);
				i = 0;
			// Increment if both good
			} else {
				i++;
			}
		}
		
		return list;
	}
}
