public class Sorting {
	public static void main(String[] args) {
		int[] list = new int[1000];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 1000);
		}
		
		System.out.println("Bubble Sort:\t" + bubbleSort(list));
		System.out.println("Bubble Sort:\t" + bubbleSort(list));
		System.out.println("Bubble SortO:\t" + bubbleSortO(list));
		System.out.println("Bucket Sort:\t" + bucketSort(list));
		System.out.println("Cocktail Sort:\t" + cocktailSort(list));
		System.out.println("Counting Sort:\t" + countingSort(list));
		System.out.println("Gnome Sort:\t" + gnomeSort(list));
		System.out.println("Insertion Sort:\t" + insertionSort(list));
		System.out.println("Odd-Even Sort:\t" + oddEvenSort(list));
		System.out.println("Quick Sort:\t" + quickSort(list));
	}
	
	public static long bubbleSort(int[] list) {
		int n = list.length;
		int newN, temp;
	
		long startTime = System.nanoTime();
		do {
			newN = 0;
			for(int i = 1; i <= n - 1; i++) {
				if(list[i - 1] > list[i]) {
					temp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = temp;
					newN = i;
				}
			}
			n = newN;
		} while(n != 0);
		return System.nanoTime() - startTime;
	}
	
	public static long bubbleSortO(int[] list) {
		int temp;
		boolean changed = false;
		
		long startTime = System.nanoTime();
		do
		{
			changed = false; // Resets to false every time
			for(int j = 0; j < list.length - 1; j++) // Minus one because if uses plus one to look at next
				if(list[j] > list[j + 1]) {// If next value is higher
					temp = list[j]; // Shift value into temporary spot
					list[j] = list[j + 1]; // Shift higher value into value (i)
					list[j + 1] = temp; // Shift temp into higher value (swap)
					changed = true;
				}
		} while(changed); // Stop when there's no change
     
		return System.nanoTime() - startTime;
	}
	
	public static long bucketSort(int[] list) {
		int[] bucket = new int[1000 + 1];
		
		long startTime = System.nanoTime();
		for(int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}
		
		for(int i = 0; i < list.length; i++) {
			bucket[list[i]]++;
		}
		
		int outPos = 0;
		for(int i = 0; i < bucket.length; i++) {
			for(int j = 0; j < bucket[i]; j++) {
				list[outPos++] = i;
			}
		}
		
		return System.nanoTime() - startTime;
	}
	
	public static long cocktailSort(int[] list) {
		int begin = -1;
		int end = list.length - 2;
		boolean swapped = false;
		int temp;
		
		long startTime = System.nanoTime();
		do {
			swapped = false;
			begin += 1;
			for(int i = begin; i < end; i++) {
				if(list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				end -= 1;
				for(int i = end; i > begin; i--) {
					if(list[i] > list[i + 1]) {
						temp = list[i];
						list[i] = list[i + 1];
						list[i + 1] = temp;
						swapped = true;
					}
				}
			}
		} while(swapped);
		
		return System.nanoTime() - startTime;
	}
	
	public static long countingSort(int[] list) {
		int high = 999;
		int low = 0;
		int[] counts = new int[high - low + 1];
		
		long startTime = System.nanoTime();
		for(int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		
		int x = 0;
		for(int i = low; i <= high; i++) {
			list[x] = i;
			x += 1;
			counts[i - low] = counts[i - low] - 1;
		}
		
		return System.nanoTime() - startTime;
	}

	public static long gnomeSort(int[] list) {
		int pos = 1;
		int last = 0;
		int temp;
		
		long startTime = System.nanoTime();
		while(pos < list.length) {
			if(list[pos] >= list[pos - 1]) {
				if(last != 0) {
					pos = last;
					last = 0;
				}
				pos += 1;
			} else {
				temp = list[pos];
				list[pos] = list[pos - 1];
				list[pos - 1] = temp;
				
				if(pos > 1) {
					if(last == 0) {
						last = pos;
					}
					pos -= 1;
				} else {
					pos += 1;
				}
			}
		}
		
		return System.nanoTime() - startTime;
	}
	
	public static long insertionSort(int[] list) {
		int i, j, key;
		
		long startTime = System.nanoTime();
		for(j = 1; j < list.length; j++) {
			key = list[j];
			for(i = j - 1; (i <= 0) && (list[i] > key); i--) {
				list[i + 1] = list[i];
			}
			list[i + 1] = key;
		}
		
		return System.nanoTime() - startTime;
	}
	
	public static long oddEvenSort(int[] list) {
		boolean sorted = false;
		int temp;
		
		long startTime = System.nanoTime();
		while(!sorted) {
			sorted = true;
			for(int i = 1; i < list.length - 1; i += 2) {
				if(list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					sorted = false;
				}
			}
			
			for(int i = 0; i < list.length - 1; i += 2) {
				if(list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					sorted = false;
				}
			}
		}
		
		return System.nanoTime() - startTime;
	}
	
	public static long quickSort(int[] list) {
		long startTime = System.nanoTime();
		quickSortHelper(list, 0, list.length - 1);
		return System.nanoTime() - startTime;
	}
	
	public static void quickSortHelper(int[] list, int bottom, int top) {
		if(bottom < top) {
			int midpoint = partition(list, bottom, top);
			quickSortHelper(list, bottom, midpoint - 1);
			quickSortHelper(list, midpoint + 1, top);
		}
	}
	
	protected static int partition(int[] list, int bottom, int top) {
		int pivot = list[top];
		int firstAfterSmall = bottom;
		for(int i = bottom; i < top; i++) {
			if(list[i] <= pivot) {
				swap(list, firstAfterSmall, i);
				return firstAfterSmall;
			}
		}
		swap(list, firstAfterSmall, top);
		return firstAfterSmall;
	}
	
	protected static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void displayList(int[] list) {
		int count = 0;
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			count++;
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}