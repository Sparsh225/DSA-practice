package technical;

public class twodmatrix {

	// search in two D matrix which is sorted row and column vise both
	public void search(int[][] matrix, int n, int key) {
		int i = 0, j = n - 1;
		while (i < n && j >= 0) {
			if (matrix[i][j] == key) {
				System.out.print("x found at " + i + "," + j);
				return;
			}
			if (matrix[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
		System.out.print("not found");
	}

	public static void main(String[] args) {
		twodmatrix td = new twodmatrix();

		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 51 } };
		System.out.println();
		td.search(matrix, 4, 55);
	}
}
