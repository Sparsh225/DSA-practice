package technical;

public class NQueen {

	public static int countWays(boolean[][] board, int currentrow) {
		int count = 0;
		if (currentrow == board.length) {
			return 1;
		}

		for (int i = 0; i < board[currentrow].length; i++) {
			if (isSafe(board, currentrow, i)) {
				board[currentrow][i] = true;
				count = count + countWays(board, currentrow + 1);
				board[currentrow][i] = false;
		}
		}
		return count;
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		// same col
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		// diagonaly
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		// board.right col
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		System.out.print(countWays(board, 0));

	}

}
