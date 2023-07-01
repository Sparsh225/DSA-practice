package bitManipulation;

public class Maxbitcombine_VALUE {

	public static int Maxvalue(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i] & a[j];
				if (temp > max) {
					max = temp;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 3, 5, 8, 10, 12 };
		int res = Maxvalue(a);
		System.out.print(res);

	}

}
