package technical;

public class Arraysorted {

	static boolean arraysorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				return false;
			}
		}
		return true;
	}

	static boolean recarraysorted(int[] a, int i) {
		if (a[i - 1] > a[i]) {
			return false;
		}
		if (i == a.length - 1) {
			return true;
		}
		return recarraysorted(a, ++i);
	}
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 9, 8 };
		System.out.println(arraysorted(a));
		System.out.println(recarraysorted(a, 1));
	}

}
