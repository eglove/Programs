import java.util.Scanner;

public class AssignGrades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask for number of students
		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
		
		// Ask grades of those students
		int[] grades = new int[num];
		System.out.print("Enter " + num + " scores: ");
		for(int i = 0; i < grades.length; i++)
			grades[i] = input.nextInt();
			
		// Get highest score
		int high = highestScore(grades);
		
		// Get letter grade and print out
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Student " + i + " score is " + grades[i] +
				" and grade is " + letterGrade(grades[i], high));
		}
	}
	
	public static int highestScore(int[] g) {
		// Return highest score in array
		int temp = 0;
		
		for(int i = 0; i < g.length; i++) {
			if(temp < g[i]) {
				temp = g[i];
			}
		}
		
		return temp;
	}

	public static char letterGrade(int n, int high) {
		if(n >= high - 10)
			return 'A';
		else if(n >= high - 20)
			return 'B';
		else if(n >= high - 30)
			return 'C';
		else if(n >= high - 40)
			return 'D';
		else
			return 'F';
	}
}