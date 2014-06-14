import java.util.Random;

public class TestStopWatch {
	public static void main(String[] args) {
		
		int[] list = new int[100000];
		Random random = new Random();
		
		// Fill list with random 100,000 integers
		for(int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(100);
		}
		
		// Start timer and sort
		StopWatch stopwatch = new StopWatch();
		selectionSort(list);
		
		stopwatch.stop();
		System.out.println((stopwatch.getElapsedTime() / 1000) + "s");
	}
	
	public static void selectionSort(int[] x) {
		for(int i = 0; i < x.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < x.length; j++) {
				if(x[minIndex] > x[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = x[i];
				x[i] = x[minIndex];
				x[minIndex] = temp;
			}
		}
	}
}