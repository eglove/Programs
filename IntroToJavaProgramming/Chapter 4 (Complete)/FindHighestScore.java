/* Write a program that prompts the user to enter the number of students and 
 * each student's name and score, and finally displays the name of the student 
 * with the highest score.
 */
import java.util.Scanner;

public class FindHighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of students: ");
		int num = input.nextInt();
		
		String[] name = new String[num + 1];
		int[] score = new int[num + 1];
		
		for(int i = 0; i <= num; i++) {
			System.out.print("Student " + i + "'s name: ");
			name[i] = input.nextLine();
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print("Student " + i + "'s score: ");
			score[i] = input.nextInt();
		}
		
		int temp = 0;
		for(int i = 1; i < score.length; i++) {
			if(score[i] > temp) {
				temp = score[i];
			}
		}
		
		System.out.println("Student " + name[temp] + 
			" had the highest score of " + score[temp] + ".");
	}
}