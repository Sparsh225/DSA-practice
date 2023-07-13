package Stack;

public class barmaxwwidthitr {

	static int maxArea(int[] a) {

		int n = a.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			// previous
			int ans = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] >= a[i]) {
					ans += a[i];
				} else {
					break;
				}
			}
			// next
			for (int j = i + 1; j < n; j++) {
				if (a[j] >= a[i]) {
					ans += a[i];
				} else {
					break;
				}
			}
			max = Math.max(max, ans);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 6, 2, 5, 4, 5, 6 };
		System.out.print(maxArea(a));
	}

}
