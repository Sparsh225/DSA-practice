package technical;

public class SellandBuy {
	public static void approach_1(int[] a) {
		int n = a.length;
		int last = 0;
		int first = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (max < (a[j] - a[i])) {
					max = a[j] - a[i];
					first = a[i];
					last = a[j];
				}
			}
		}
		System.out.println("The first " + first + " last is " + last);
	}

	public static void approach_2(int[] a) {
		int n = a.length;
		int[] prefixmin = new int[n];
		int profit = 0, finalprofit = 0;
		prefixmin[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefixmin[i] = Math.min(prefixmin[i - 1], a[i]);
		}
		for (int i = 1; i < n; i++) {
			profit = a[i] - prefixmin[i];
			finalprofit = Math.max(finalprofit, profit);

		}
		System.out.println(finalprofit);

	}

	public static void approach_3(int[] a) {
		int n = a.length;
		int profit = 0, finalprofit = 0;
		int min = a[0];
		for (int i = 1; i < n; i++) {
			profit = a[i] - min;
			finalprofit = Math.max(finalprofit, profit);
			min = Math.min(min, a[i]);
		}
		System.out.println(finalprofit);
	}
	public static void main(String[] args) {
		int[] a = { 7, 1, 5, 3, 6, 4 };
		approach_2(a);

	}

}
