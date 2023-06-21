package technical;

public class SudokuSolver {
	final static int max = 9;
	static char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
			{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
			{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
			{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
			{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

	public static boolean sudko(int row, int col) {
		if (col == max) {
			row = row + 1;
			col = 0;
		}
		if (row == max) {
			return true;
		}
		if (board[row][col] != '.') {
			return sudko(row, col + 1);
		}
		for (int i = 1; i <= max; i++) {
			if (isSafe(row, col, (char) (i + '0'))) {
				board[row][col] = (char) (i + '0');
				boolean result = sudko(row, col + 1);
				if (result) {
					return true;
				}
				board[row][col] = '.';
			}
		}
		return false;
	}

	public static boolean ispresentRow(int row, char val) {
		for (int col = 0; col < max; col++) {
			if (board[row][col] == val) {
				return true;
			}
		}
		return false;
	}

	public static boolean ispresentCol(int col, char val) {
		for (int row = 0; row < max; row++) {
			if (board[row][col] == val) {
				return true;
			}
		}
		return false;
	}

	public static boolean ispresentGrid(int row, int col, char val) {
		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (board[i][j] == val) {
					return true;
				}
			}
		}
		return false;

	}

	public static boolean isSafe(int row, int col, char val) {
		return !ispresentRow(row, val) && !ispresentCol(col, val) && !ispresentGrid(row, col, val);
	}

	static void print() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + ",");
			}
			System.out.println();
		}
	}

	// public void solveSudoku(char[][] board) {
	// solver(0, 0);
	// }
	public static void main(String[] args) {

		System.out.print(sudko(0, 0));
		print();
	}

}
