/* Write a program that displays the following table:
 * a b pow(a,b)
 * 1 2 1
 * 2 3 8
 * 3 4 81
 * 4 5 1024
 * 5 6 15625
 */

public class PrintATable {
	public static void main(String[] args) {
		
		// Header
		System.out.println("a\tb\tpow(a,b)");
		
		for(int i = 1, j = 2; i <= 5; i++, j++) {
			System.out.println(i + "\t" + j + "\t" + (int)(Math.pow(i,j)));
		}
	}
}