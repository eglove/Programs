import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		
		// Generates random object with seed of 1000,
		// two objects with same seed generate same sequence
		// of numbers
		Random random = new Random(1000);
		
		int count = 0;
		
		// nextInt prints numbers between 0 and 100
		for(int i = 0; i < 60; i++) {
			System.out.print(random.nextInt(100) + " ");
			count++;
			
			// Print 10 results per line
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}