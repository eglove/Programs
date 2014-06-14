import java.util.Arrays;

public class SortStudentsGrades {
	public static void main(String[] args) {
		// Students' answers to the questions
		int[][] sorted = new int[8][2];
		char[][] answers = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		// Grade all answers
		for(int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for(int j = 0; j < answers[i].length; j++) {
				if(answers[i][j] == keys[j])
					correctCount++;
			}
			
			// Record student and score
			sorted[i][0] = i;
			sorted[i][1] = correctCount;
		}
		
		// Sort array
		sorted = sortList(sorted);
		
		// Print array
		printArray(sorted);
	}
	
	public static int[][] sortList(int[][] m) {
		int temp;
		boolean changed = false;
		
		do {
			changed = false; // Reset to false
			for(int i = 0; i < m.length - 1; i++) // +1 on next line
				if(m[i][1] > m[i + 1][1]) { // If next value is higher
					// Swap column 0
					temp = m[i][0];
					m[i][0] = m[i + 1][0];
					m[i + 1][0] = temp;
					
					// Swap column 1
					temp = m[i][1]; // Shift value to temp spot
					m[i][1] = m[i + 1][1]; // Shift higher value into value i
					m[i + 1][1] = temp; // Shift temp into higher value (swap)
					changed = true;
				}
		} while(changed); // Stop when there's no change
		
		return m;
	}
	
	public static void printArray(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length - 1; j++) {
				System.out.println("Student " + m[i][0] + "'s score is " 
					+ m[i][1]);
			}
		}
	}
}