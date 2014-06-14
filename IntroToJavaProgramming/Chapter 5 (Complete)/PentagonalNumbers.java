/* A pentagonal number is defined as n(3n-1)/2 for n = 1,2,..., and so n. 
 * Therefore, the first few numbers are 1, 5, 12, 22, ... Write a method with 
 * the following header that return a pentagonal number:
 * public static int getPentagonalNumber(int n)
 * Write a test program that uses this method to display the first 100 
 * pentagonal numbers with 10 numbers on each line.
 */
 
public class PentagonalNumbers {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(getPentagonalNumber(i) + "\t");
			count++;
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1))/2;
	}
}