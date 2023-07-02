package technical;

public class Maxchunks {

	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 3, 4 };
		int[] presum = new int[a.length];
		presum[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			presum[i] = Math.max(a[i], presum[i - 1]);
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (presum[i] == i) {
				count++;
			}
		}
		System.out.print(count);
	}

}
