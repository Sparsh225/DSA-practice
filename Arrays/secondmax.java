package technical;

public class secondmax {
	public static void main(String[] args) {
		int[] a = { 3, 6, 77, 43, 2 };
		int max = 0, secmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (secmax < a[i]) {
				secmax = a[i];
				if (secmax == max) {
					secmax = 0;
				}
			}
		}
		System.out.print("Max " + max + " second max " + secmax);
	}
}
