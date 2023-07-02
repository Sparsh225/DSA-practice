package technical;

public class Maximumsumkelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 40, 30, 10, 20, 5 };
		int k = 3;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}
		int j = k;
		int max = sum;
		for (int i = 0; i < a.length; i++) {
			if (j < a.length) {
				sum = sum - a[i] + a[j];
				j++;
			}
			if (sum > max) {
				max = sum;
			}
		}
		System.out.print(max);
	}
}
