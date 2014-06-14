public class GuessDate {
	public final static int[][] set1 = {{1, 3, 5, 7},
		{9, 11, 13 ,15},
		{17, 19, 21, 23},
		{25, 27, 29, 31}};
	public final static int[][] set2 = {{2, 3, 6, 7},
		{10, 11, 14, 15},
		{18, 19, 22, 23},
		{26, 27, 30, 31}};
	public final static int[][] set3 = {{4, 5, 6, 7},
		{12, 13, 14, 15},
		{20, 21, 22, 23},
		{28, 29, 30, 31}};
	public final static int[][] set4 = {{8, 9, 10, 11},
		{12, 13, 14, 15},
		{24, 25, 26, 27},
		{28, 29, 30, 31}};
	public final static int[][] set5 = {{16, 17, 18, 19},
		{20, 21, 22, 23},
		{24, 25, 26, 27},
		{28, 29, 30, 31}};
	
	// Prevent the user from creating objects from GuessDate
	private GuessDate() {}
	
	// Return a date a the specified row and column in a given set
	public static int getValue(int setNo, int i, int j) {
		switch(setNo) {
			case 0: return set1[i][j];
			case 1: return set2[i][j];
			case 2: return set3[i][j];
			case 3: return set4[i][j];
			case 4: return set5[i][j];
		}
		
		return 0;
	}
}