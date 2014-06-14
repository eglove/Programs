public class CountSingleDigits {
	public static void main(String[] args) {
		// Generate 100 random numbers between 0 and 9, get counts for each
		int[] array = new int[10];
		
		for(int i = 1; i <= 100; i++) {
			int temp = (int)(Math.random() * 10);
			
			array[temp]++;
		}
		
		// Display
		for(int i = 0; i < array.length; i++) {
			System.out.println(i + " appears " + array[i] + " times.");
		}
	}
}