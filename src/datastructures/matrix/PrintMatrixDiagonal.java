package datastructures.matrix;

public class PrintMatrixDiagonal {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// rows
		int row = matrix.length;
		// column
		int col = matrix[0].length;
		for (int k = 0; k < row; k++) {
			int i = k;
			int j = 0;
			// Each diagonal ends at first row which is 0
			while (i > -1) {
				System.out.print(matrix[i][j]);
				i = i - 1;
				j = j + 1;
			}
			System.out.println();
		}

		for (int k = 1; k < col; k++) {
			int i = row - 1;
			int j = k;
			// Each diagonal ends at first row which is 0
			while (j <= col - 1) {
				System.out.print(matrix[i][j]);
				i = i - 1;
				j = j + 1;
			}
			System.out.println();
		}
	}

}
