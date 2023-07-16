package Sorting;

public class SelecttionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 4, 5, 1, 3, 88, 3 };
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}

		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
