/* Write a program that displays a random upper-case letter using the
 * System.CurrentTimeMillis() method.
 */
 
public class RandomCharacter {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			int rand = (int)(65 + Math.random() * (90-65));
			char ch = (char)rand;
			// ch = Character.toUpperCase(ch);
			System.out.print(ch + " ");
		}
	}
}