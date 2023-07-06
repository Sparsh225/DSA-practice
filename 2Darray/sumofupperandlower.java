package TwoDarray;

public class sumofupperandlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int a[][] = { { 6, 5, 4 }, { 1, 2, 5 }, { 7, 9, 7 } };

		// sum of upper
		int sumU = 0, sumD = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j >= i) {
					sumU += a[i][j];
				}

			}
		}
		System.out.print(sumU + " ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j <= i) {
					sumD += a[i][j];
				}
			}
		}
		System.out.print(sumD + " ");
	}

}
