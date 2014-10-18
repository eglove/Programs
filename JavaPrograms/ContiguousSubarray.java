import java.util.Arrays;

public class ContiguousSubarray {
	public static void main(String[] args) {
		// Test input 1
		int[] test1 = {10, 12, 11};
		// Test input 2
		int[] test2 = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		
		// Insertion sort arrays
		Arrays.sort(test1);
		Arrays.sort(test2);
		
		// Count for contiguous subarrays
		int cTest1 = contiguousCount(test1);
		int cTest2 = contiguousCount(test2);
		
		System.out.println("Length of longest contiguous subarray is " + cTest1);
		System.out.println("Length of longest contiguous subarray is " + cTest2);
	}
	
	public static int contiguousCount(int[] list) {
		int count=1, largest=0;
		
		for(int i = 0, j=1; j < list.length; i++, j++) {
			if(list[i]+1 == list[j]) { // If next element is incremental
				count++; // Increase count
			} else if(count > largest) { // If count is largest
				largest = count; // Set new largest
				count = 1;
			}
		}
		
		if(count > largest) // If else if was never hit
			largest = count;
		
		return largest;
	}
}