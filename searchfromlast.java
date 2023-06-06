package technical;

public class searchfromlast {
	static int last(int[] a, int key) {
		for (int i = a.length - 1; i > 0; i--) {
			if (key == a[i]) {
				for (int j = 0; j < a.length; j++) {
					if (i == j) {
						return j;
					}
				}
			}
		}
		return -1;
	}

	static int pos(int[] a, int j, int i) {
		if (a.length == j) {
			return -1;
		}
		if (i == j) {
			return j;
		}
		return pos(a, ++j, i);
	}

	static int reclast(int[] a, int key, int i) {
		if (i == 0) {
			return -1;
		}
		if (a[i] == key) {
			return pos(a, 0, i);
		}
		return reclast(a, key, --i);
	}
	public static void main(String[] args) {
		int[] a = { 20, 90, 1, 90, 6 };
		System.out.println(last(a, 90));
		System.out.println(reclast(a, 90, 4));

	}

}
