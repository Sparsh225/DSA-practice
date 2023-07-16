package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 4, 5, 1, 3, 88, 3 };
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int temp = a[i];
			while (j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
