import java.util.*;
import java.io.*;

public class QuickSort {
	public static void main(String[] args) throws java.io.IOException {
	
		FileReader file = null;
		File infile = new File("input.txt");
		Scanner input = new Scanner(infile);
		
		int[] data = new int[100];
		int x, count = 0;
		
		while(input.hasNext()) {
			x = input.nextInt();
			data[count++] = x;
		}
		
		System.out.println("Array before Sort");
		for(int i = 0; i < count; i++) {
			System.out.printf("%d ", data[i]);
			if((i + 1) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		
		quickSort(data, count);
		
		System.out.println("\n\nArray after Sort");
		for(int i = 0; i < count; i++) {
			System.out.printf("%d ", data[i]);

			if((i + 1) % 7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}
	
	public static void quickSort(int[] a, int count) {
		Partition(a, 0, count - 1);
	}
	
	public static void Partition(int[] numbers, int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];
		
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			
			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(numbers, i, j);
				i++;
				j--;
			}
		}
		
		if (low < j)
			Partition(numbers, low, j);
		if (i < high)
			Partition(numbers, i, high);
	}
	
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}