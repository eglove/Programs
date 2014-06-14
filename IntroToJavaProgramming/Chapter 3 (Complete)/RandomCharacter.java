/* Write a program that displays a random uppercase  letter using the 
 * Math.random() method.
 */

public class RandomCharacter {
	public static void main(String[] args) {
		final int MAX = 90;
		final int MIN = 65;
		int count = 0;
		
		for(int i = 0; i < 100; i++) {
			int rand = (MIN + (int)(Math.random() * ((MAX - MIN) + 1)));
			System.out.print((char)rand + " ");
			
			count++;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}