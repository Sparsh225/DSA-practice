package TwoDarray;

public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 5 },
					{ 4, 6, 7, 1 },
					{ 1, 5, 8, 2 },
					{ 5, 6, 8, 9 } };
		// no of rows
		int m = a.length;
		// no col
		int n = a[0].length;
		// start row index
		int k = 0;

		// col index
		int l = 0;
		int i;
		while (k < m && l < n) {
			// print rows
			for (i = l; i < n; i++) {
				System.out.print(a[k][i] + " ");
			}
			k++;
			// print cols(last cols)
			for (i = k; i < m; i++) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;
			// print last row
			if (k < m) {
				for (i = n - 1; i >= l; i--) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}
			if (l < n) {
				for (i = m - 1; i >= k; i--) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}

	}

}
