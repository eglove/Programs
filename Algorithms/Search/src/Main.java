import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Compare average search times on an integer array with linear, binary, and ternary searches.

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // Key represents upper bound of integer to be search for, length of random array, and upper bound of integers to fill array
        // Array given random unique integers from 0 - key, because they are unique, it's best these numbers are all the same
        int key = 1000000;
        int searchForThis = random.nextInt(key + 1);
        int[] array = generateRandomArray(key, key);

        // Get average time
        ArrayList<Long> linearTimes = new ArrayList<>();
        ArrayList<Long> binaryTimes = new ArrayList<>();
        ArrayList<Long> ternaryTimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            linearTimes.add(linearSearch(array, searchForThis));
            binaryTimes.add(binarySearch(array, searchForThis));
            ternaryTimes.add(ternarySearch(array, searchForThis, 0, array.length - 1));
        }

        System.out.println("Linear search average time: " + printTime(getAverage(linearTimes)));
        System.out.println("Binary search average time: " + printTime(getAverage(binaryTimes)));
        System.out.println("Ternary search average time: " + printTime(getAverage(ternaryTimes)));
    }

    private static long getAverage(ArrayList<Long> list) {
        long sum = 0;
        for(long l : list) {
            sum += l;
        }
        return sum / list.size();
    }

    private static String printTime(long time) {
        int nanoseconds = (int) time;
        int microseconds = nanoseconds / 1000;
        int milliseconds = (int) (nanoseconds / 1e+6);
        int seconds = (int) (nanoseconds / 1e+9);
        int minutes = (int) (nanoseconds / 6e+10);

        if(minutes > 0) {
            return minutes + " minutes";
        }
        if(seconds > 0) {
            return seconds + " seconds";
        }
        if(milliseconds > 0) {
            return milliseconds + " milliseconds";
        }
        if(microseconds > 0) {
            return microseconds + " microseconds";
        }
        if(nanoseconds > 0) {
            return nanoseconds + " nanoseconds";
        }
        return "0";
    }

    private static long ternarySearch(int[] array, int searchForThis, int left, int right) {
        long start = System.nanoTime();
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (array[mid1] == searchForThis) {
                return System.nanoTime() - start;
            }
            if (array[mid2] == searchForThis) {
                return System.nanoTime() - start;
            }
            // If n is less than upper bound of first third, search first third
            if (searchForThis < array[mid1]) {
                return ternarySearch(array, searchForThis, left, mid1 - 1);
                // If n is greater than lower bound of last third, search last third
            } else if (searchForThis > array[mid2]) {
                return ternarySearch(array, searchForThis, mid2 + 1, right);
                // If n is between first and last third, search middle third
            } else {
                return ternarySearch(array, searchForThis, mid1 + 1, mid2 - 1);
            }
        }
        return 0;
    }

    private static long binarySearch(int[] array, int searchForThis) {
        int low = 0;
        int high = array.length;
        long start = System.nanoTime();
        Arrays.sort(array);
        while (low <= high) {
            // Get middle integer in array
            int mid = (low + high) / 2;
            // If middle integer is less than search, check everything above this
            if (array[mid] < searchForThis) {
                low = mid + 1;
                // If middle integer is greater than search, check everything lower than this
            } else if (array[mid] > searchForThis) {
                high = mid - 1;
                // Else integer found, return time
            } else {
                return System.nanoTime() - start;
            }
        }

        return 0;
    }

    private static long linearSearch(int[] array, int searchForThis) {
        long start = System.nanoTime();
        for (int i : array) {
            if (i == searchForThis) {
                return System.nanoTime() - start;
            }
        }

        return 0;
    }

    private static int[] generateRandomArray(int size, int range) {
        Random random = new Random();
        return random.ints(0, range + 1).distinct().limit(size).toArray();
    }
}
