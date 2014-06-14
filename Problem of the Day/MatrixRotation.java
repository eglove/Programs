import java.util.Arrays;

public class MatrixRotation {
	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
		};
		
		System.out.println(Arrays.toString(rotate(matrix)));
	}
	
	public static int[][] rotate(int[][] m) {
		int[][] rotateM = new int[m[0].length][m.length];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				rotateM[j][i] = m[m.length-i-1][j];
			}
		}
		
		return rotateM;
	}
}