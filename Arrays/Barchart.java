package technical;

public class Barchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 1, 0, 5, 6 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		for (int i = max; i >= 1; i--) {
			for (int j = 0; j < a.length; j++) {
				if (i <= a[j]) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
