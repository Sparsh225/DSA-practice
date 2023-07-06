package TwoDarray;

import java.util.Arrays;

public class KweakestRowinMatrix {
	public static int[] kWeakestRows(int[][] mat, int k) {
		int arr[] = new int[k];
		int[][] res = new int[mat.length][2];
		for (int i = 0; i < mat.length; i++) {
			int count = 0;
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					break;
				}
				count++;
			}
			res[i][0] = count;
			res[i][1] = i;

		}
		Arrays.sort(res, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});
		for (int i = 0; i < arr.length; i++) {
			arr[i] = res[i][1];
		}
		return arr;
	}
	public static void main(String[] args) {

		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		int k = 3;
		int[] a = kWeakestRows(mat, k);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
