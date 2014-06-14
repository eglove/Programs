/* Write a program that reads an unspecified number of integers, determines how 
 * many positive and negative values have been read, and computes the total and 
 * average of the input values (not counting zeroes). YOu program ends with the 
 * input 0. Display the average as a floating-point number. Here is a sample 
 * run:
 * Enter an integer, the input ends if it is 0: 1 2 -1 3 0
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 5
 * The average is 1.25
 * Enter an integer, the input ends if it is 0: 0
 * No numbers are entered except 0
 */
import java.util.Scanner;

public class CountPositiveNegativeComputeAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = -1, positiveCount = 0, negativeCount = 0, sum = 0;
		
		System.out.print("Enter an integer, the input end if it is 0: ");
		
		while(number != 0) {
			number = input.nextInt();
			sum += number;
			if(number == 0 && positiveCount == 0 && negativeCount == 0) {
				System.out.println("No numbers are entered except 0");
				break;
			}
			else if(number > 0 && number != 0)
				positiveCount++;
			else if(number < 0 && number != 0)
				negativeCount++;
			else if(number == 0) {
				break;
			}
		}
		
		float average = sum / (positiveCount + negativeCount + 1);
		System.out.println("The number of positives is " + positiveCount +
			"\nThe number of negatives is " + negativeCount +
			"\nThe total is " + (positiveCount + negativeCount + 1) +
			"\nThe average is " + average);
	}
}