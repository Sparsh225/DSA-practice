package technical;

public class RatinMaze {
	static int N;

	static void printSolution(int sol[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(" " + sol[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean solveMaze(int maze[][]) {
		int sol[][] = new int[N][N];

		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}

		printSolution(sol);
		return true;
	}

	public static boolean solveMazeUtil(int[][] board, int row, int col, int[][] sol) {
		if (row == N - 1 && col == N - 1 && board[row][col] == 1) {
			sol[row][col] = 1;
			return true;
		}
		if (issafe(board, row, col)) {
			if (sol[row][col] == 1) {
				return false;
			}
			sol[row][col] = 1;

			if (solveMazeUtil(board, row + 1, col, sol)) {
				return true;
			}

			if (solveMazeUtil(board, row, col + 1, sol)) {
				return true;
			}

			sol[row][col] = 0;
			return false;
		}
		return false;
	}

	private static boolean issafe(int[][] maze, int x, int y) {
		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}
	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

		N = maze.length;
		solveMaze(maze);
	}

}
