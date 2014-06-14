/* Use a while loop to find the smallest integer n such that n^2 is greater than 
 * 12,000.
 */
public class SmallestN {
	public static void main(String[] args) {
		double n = 2;
		
		while(n*n <= 12000) {
			n++;
		}
		
		System.out.println(n);
	}
}