package technical;

public class even_integer_removed {

	public static void main(String[] args) {
		even_integer_removed ev = new even_integer_removed();
		int[] arr = { 12, 4, 3, 5, 6, 7, 14, 20, 7 };
		ev.printarr(arr);
		int[] a = ev.removedeven(arr);
		ev.printarr(a);
		ev.reverse(arr);
		ev.printarr(arr);
		System.out.println("min value: " + ev.minimumvalue(arr));
		System.out.println("Second max value: " + ev.minimumvalue(arr));
		int[] arr1 = { 12, 0, 3, 5, 0, 7, 0, 20, 7 };
		System.out.println("move Zero Right");
		ev.movezeroRight(arr1);
		ev.printarr(arr1);
		
		int[] arr2 = { 2, 3, 5, 1, 6, 8, 9, 7 };
		System.out.println("missing number " + ev.missingnumber(arr2));
78
	}

	public int[] removedeven(int[] arr) {
		int oddc = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddc++;
			}
		}
		int indx = 0;
		int[] a = new int[oddc];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				a[indx] = arr[i];
				indx++;
			}
		}
		return a;
	}

	public void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void reverse(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public int minimumvalue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public int secondmax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secmax = max;
				max = arr[i];
			} else if (arr[i] != max && secmax < arr[i]) {
				secmax = arr[i];
			}
		}
		return secmax;
	}

	public void movezeroRight(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}
	
	public int missingnumber(int[] arr) {
		int n = arr.length - 1;
		int sum = n * n + 1 / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		return sum;
	}
}
