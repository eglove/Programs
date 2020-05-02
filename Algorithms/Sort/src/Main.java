import java.util.ArrayList;
import java.util.Random;

public class Main {
    // Compares average times of various sorting algorithms
    static int size = 1000;
    static int timesToRun = 100;

    public static void main(String[] args) {
        int[] toBeSorted = new int[size];
        Random random = new Random();
        for (int i = 0; i < size + 1; i++) {
            toBeSorted[i] = random.nextInt(size);
        }

        String[] sortingMethods = new String[]{"bubble", "selection", "insertion", "merge", "quick",
            "counting", "radix", "heap", "bucket", "cocktail", "gnome", "oddEven", "doublePivotQuick",
            "shell", "bitonic"};
        for(String s : sortingMethods) {
            System.out.println(s + " average time: " + getAverageTime(toBeSorted, timesToRun, s) + " nanoseconds.");
        }
    }

    private static long getAverageTime(int[] toBeSorted, int timesToRun, String sortMethod) {
        ArrayList<Long> times = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < timesToRun; i++) {
            switch (sortMethod) {
                case "bubble":
                    times.add(bubbleSort(toBeSorted));
                    break;
                case "selection":
                    times.add(selectionSort(toBeSorted));
                    break;
                case "insertion":
                    times.add(insertionSort(toBeSorted));
                    break;
                case "merge":
                    times.add(mergeSort(toBeSorted, 0, toBeSorted.length - 1));
                    break;
                case "quick":
                    times.add(quickSort(toBeSorted));
                    break;
                case "counting":
                    times.add(countingSort(toBeSorted));
                    break;
                case "radix":
                    times.add(radixSort(toBeSorted));
                    break;
                case "heap":
                    times.add(heapSort(toBeSorted));
                    break;
                case "bucket":
                    times.add(bucketSort(toBeSorted));
                    break;
                case "cocktail":
                    times.add(cocktailSort(toBeSorted));
                    break;
                case "gnome":
                    times.add(gnomeSort(toBeSorted));
                    break;
                case "oddEven":
                    times.add(oddEvenSort(toBeSorted));
                    break;
                case "doublePivotQuick":
                    times.add(doublePivotQuickSort(toBeSorted));
                    break;
                case "shell":
                    times.add(shellSort(toBeSorted));
                    break;
                case "bitonic":
                    times.add(bitonicSort(toBeSorted));
                    break;
                // Wrong input has consequences.
                default:
                    times.add(bogoSort(toBeSorted));
                    break;
            }
        }

        for (long i : times) {
            sum += i;
        }
        return sum / times.size();
    }

    private static Long mergeSort(int[] toBeSorted, int left, int right) {
        long beginTime = System.nanoTime();
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(toBeSorted, left, mid); // Sort first half
            mergeSort(toBeSorted, mid + 1, right); // Sort second half
            merge(toBeSorted, left, mid, right);
        }
        return System.nanoTime() - beginTime;
    }

    private static void merge(int[] toBeSorted, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        // Copy to temp arrays
        System.arraycopy(toBeSorted, 0, leftArray, 0, leftSize);
        System.arraycopy(toBeSorted, mid + 1, rightArray, 0, rightSize);

        int leftIndex = 0, rightIndex = 0;
        int mergedIndex = 1;
        // If current leftIndex less than current rightIndex, add left element
        // to merged array, vice versa
        while(leftIndex < leftSize && rightIndex < rightSize) {
            if(leftArray[leftIndex] <= rightArray[rightIndex]) {
                toBeSorted[mergedIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                toBeSorted[mergedIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }
        // Copy remaining elements
        while(leftIndex < leftSize) {
            toBeSorted[mergedIndex] = leftArray[leftIndex];
            leftIndex++;
            mergedIndex++;
        }
        while (rightIndex < rightSize) {
            toBeSorted[mergedIndex] = rightArray[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
    }

    private static Long insertionSort(int[] toBeSorted) {
        long start = System.nanoTime();
        // Compare i, j
        int i, j, temp;
        // Start at index 1, compare all elements to left
        for(j = 1; j < toBeSorted.length; j++) {
            temp = toBeSorted[j];
            // If int to left is greater than temp, swap
            for(i = j - 1; (i <= 0) && (toBeSorted[i] > temp); i--) {
                toBeSorted[i + 1] = toBeSorted[i];
            }
            // Set temp to 0 position
            toBeSorted[i + 1] = temp;
        }
        return System.nanoTime() - start;
    }

    private static Long selectionSort(int[] toBeSorted) {
        long start = System.nanoTime();
        int smallest, temp;
        for (int i = 0; i < toBeSorted.length - 1; i++) {
            // assume first element is smallest
            smallest = i;
            // If j smaller than current, set it to smallest
            for(int j = i + 1; j < toBeSorted.length; j++) {
                if(toBeSorted[j] < toBeSorted[smallest]) {
                    smallest = j;
                }
            }
            // Put smallest in correct position
            temp = toBeSorted[smallest];
            toBeSorted[smallest] = toBeSorted[i];
            toBeSorted[i] = temp;
        }
        return System.nanoTime() - start;
    }

    private static Long bubbleSort(int[] toBeSorted) {
        long start = System.nanoTime();
        int temp;
        // Reruns until algorithm complete
        for(int i = 0; i < toBeSorted.length; i++) {
            // Compare j, j+1, swap accordingly
            for(int j = 0; j < toBeSorted.length - i; j++) {
                if(toBeSorted[j] > toBeSorted[j+1]) {
                    temp = toBeSorted[j];
                    toBeSorted[j] = toBeSorted[j + 1];
                    toBeSorted[j + 1] = temp;
                }
            }
        }
        return System.nanoTime() - start;
    }
}
