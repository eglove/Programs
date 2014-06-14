import java.util.Scanner;
import java.util.Arrays;

public class AnalyzeScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[100];
		
		// User input of scores, negative means end input
		System.out.print("Enter the scores: ");
		double score = input.nextInt();
		int in = 0;
		while(score >= 0) {
			scores[in++] = score;
			score = input.nextInt();
		}
		
		// Find average score
		double avg = average(scores);
		
		// How many scores are above or equal to average
		double aboveAvg = aboveOrEqual(scores, avg);
		
		// How many scores are below average
		double belowAvg = belowAverage(scores, avg);
		
		// Display results
		System.out.println("Average score is: " + avg +
			"\nScores above or equal to average is: " + aboveAvg +
			"\nScores below average is: " + belowAvg);
	}
	
	public static double average(double[] a) {
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			
			if(a[i] != 0)
				count++;
		}
		
		return sum / count;
	}
	
	public static double aboveOrEqual(double[] a, double avg) {
		int count = 0;
		
		for(int i = 0; i < a.length; i++)
			if(a[i] >= avg)
				count++;
				
		return count;
	}
	
	public static double belowAverage(double[] a, double avg) {
		int count = 0;
		
		for(int i = 0; i < a.length; i++)
			if(a[i] < avg && a[i] != 0)
				count++;
				
		return count;
	}
}