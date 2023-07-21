package Sorting;

public class QuickSort {

	public static int partition(int[] a, int start, int end) {
		int pindex = start;
		int pivot = a[end];
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				int t = a[i];
				a[i] = a[pindex];
				a[pindex] = t;
				pindex++;
			}
		}
		int t = a[end];
		a[end] = a[pindex];
		a[pindex] = t;
		return pindex;
	}

	public static void Quicksort(int a[], int start, int end) {
		if (start < end) {
			int pindex = partition(a, start, end);
			Quicksort(a, start, pindex - 1);
			Quicksort(a, pindex + 1, end);

		}
	}

	public static void main(String[] args) {
		int[] a = { 8, 4, 5, 1, 3, 88, 3 };
		int l = 0;
		int h = a.length - 1;
		Quicksort(a, l, h);
		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
