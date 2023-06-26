package technical;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		int target = 9;
		// Arrays.sort(a);
		int i = 0, j = a.length - 1;
		int sum = 0;
		while (true) {
			sum = a[i] + a[j];
			// System.out.println(sum + " " + a[i] + " " + a[j]);
			if (sum == target) {
				System.out.print("index are " + i + " " + j);
				break;
			}
			if (sum > target) {
				j--;
			} else {
				i++;
			}
			// System.out.print("index are " + i + " " + j);
		}

	}

}
