package TwoDarray;

public class snakepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 4, 5, 3, 1 }, { 6, 8, 9, 4 } };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + ",");
				}
			} else {
				for (int j = a[i].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + ",");
				}
			}
		}
	}

}
