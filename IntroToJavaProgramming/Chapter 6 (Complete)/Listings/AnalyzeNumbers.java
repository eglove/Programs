public class AnalyzeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 100;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			numbers[i] = Math.random() * 100;
			sum += numbers[i];
		}
		
		double average = sum / NUMBER_OF_ELEMENTS;
		
		int count = 0; // The number of elements above average
		for(int i = 0; i < NUMBER_OF_ELEMENTS; i++)
			if(numbers[i] > average)
				count++;
				
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average " + count);
	}
}