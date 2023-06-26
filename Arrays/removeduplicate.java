package technical;

public class removeduplicate {

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result[] = new int[a.length];
		int i = 0, c = 0;
		for (int j = 1; j < a.length; j++) {
			if (a[j - 1] != a[j]) {
				result[i] = a[j];
				i++;
				c++;
			}
		}

		System.out.print(c + 1 + " ");

	}

}
