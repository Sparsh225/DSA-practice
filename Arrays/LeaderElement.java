package technical;

public class LeaderElement {

	public static void main(String[] args) {
		int[] a = { 30, 80, 50, 2, 7, 78, 33, 27 };
		int max = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > max) {
				System.out.println("The max element " + a[i]);
				max = a[i];
			}
		}

	}

}
