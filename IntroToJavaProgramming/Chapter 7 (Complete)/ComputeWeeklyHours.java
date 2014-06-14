public class ComputeWeeklyHours {
	public static void main(String[] args) {
		int[][] totals = new int[8][2];
		int[][] hours = {
			{2, 4, 3, 4, 5, 8, 8},
			{7, 3, 4, 3, 3, 4, 4},
			{3, 3, 4, 3, 3, 2, 2},
			{9, 3, 4, 7, 3, 4, 1},
			{3, 5, 4, 3, 6, 3, 8},
			{3, 4, 4, 6, 3, 4, 4},
			{3, 7, 4, 8, 3, 8, 4},
			{6, 3, 5, 9, 2, 7, 9}
		};
		
		// Initialize employee numbers in totals matrix
		for(int i = 0; i < totals.length; i++)
			totals[i][0] = i;
		
		// Sum row totals (employee hours)
		totals = sum(hours, totals);
		
		// Sort hours total in decreasing order
		totals = sort(totals);
		
		// Display employees and hours
		display(totals);
	}
	
	public static int[][] sum(int[][] h, int[][] t) {
		// Sums rows in h and puts into t
		for(int row = 0; row < h.length; row++)
			for(int column = 0; column < h[row].length; column++)
				t[row][1] += h[row][column];
				
		return t;
	}
	
	public static int[][] sort(int[][] a) {
		// Sort array in descending order
		int temp;
		boolean changed = false;
		
		do {
			changed = false;
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i][1] > a[i + 1][1]) {
					// Swap column 0
					temp = a[i][0];
					a[i][0] = a[i + 1][0];
					a[i + 1][0] = temp;
				
					// Swap column 1
					temp = a[i][1];
					a[i][1] = a[i + 1][1];
					a[i + 1][1] = temp;
					changed = true;
				}
			}
		} while(changed);
		
		return a;
	}
	
	public static void display(int[][] a) {
		for(int row = 0; row < a.length; row++)
			for(int column = 0; column < a[row].length - 1; column++)
				System.out.println("Employee " + a[row][0] + " worked " +
					a[row][1] + " hours.");
	}
}