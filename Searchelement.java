package technical;

public class Searchelement {
	static int search(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int recsearch(int[] a, int key, int i) {
		if (a.length - 1 == i) {
			return -1;
		}
		if (a[i] == key) {
			return i;
		}

		return recsearch(a, key, ++i);
	}
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 9, 8 };
		System.out.println(search(a, 9));
		System.out.println(recsearch(a, 5, 0));

	}

}
