package technical;

public class ZigZag {

	public static void main(String[] args) {
		int[] a = { 4, 3, 7, 8, 2, 6, 1 };
		// o/p:-3748261
		boolean flag = true;
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (flag == true) {
				if (a[i + 1] < a[i]) {
					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}
			} else {
				if (a[i + 1] > a[i]) {
					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}
			}
			flag = !flag;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
