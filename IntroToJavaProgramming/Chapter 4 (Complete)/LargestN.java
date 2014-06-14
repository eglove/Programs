/* Use a while loop to find the largest integer n such that n^3 is less than 
 * 12,000.
 */
public class LargestN {
	public static void main(String[] args) {
		double n = 2;		
		
		while(Math.pow(n,3) < 12000) {
			n++;
		}
		
		System.out.println(n - 1);
	}
}