import java.util.ArrayList;

public class ListMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		
		// Initialize matrix to 0 or 1
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int)(Math.random() * 2);
			}
		}
		
		ArrayList<Integer> rowTotals = new ArrayList<Integer>();
		ArrayList<Integer> colTotals = new ArrayList<Integer>();
		
		// Get total for each row
		int rowTotal = 0;
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				rowTotal += matrix[row][column];
			}
			rowTotals.add(rowTotal);
			rowTotal = 0;
		}
		
		// Get total for each column
		int colTotal = 0;
		for(int column = 0; column < matrix[0].length; column++) {
			for(int row = 0; row < matrix.length; row++) {
				colTotal += matrix[column][row];
			}
			colTotals.add(colTotal);
			colTotal = 0;
		}
		
		// Display matrix
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		
		// Display largest row and column index
		int rowM = max(rowTotals);
		int colM = max(colTotals);
		
		System.out.println("The largest row index: " + rowM);
		System.out.println("The largest column index: " + colM);
	}
	
	public static int max(ArrayList<Integer> list) {
		int max = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = i;
			}
		}
		
		return max;
	}
}