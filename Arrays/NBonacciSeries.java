package technical;

public class NBonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i/p : n = 3, nthTerm = 15
		// o/p : 0,0,1,1,2,4,7,13,24,44,81,149,274,504
		int slide = 3;
		int nth = 15;
		int[] arr = new int[nth];
		for (int i = 0; i < slide - 1; i++) {
			arr[i] = 0;
		}
		arr[slide - 1] = 1;
		int start = -1;
		int second = 0;
		for (int i = slide; i < arr.length - 1; i++) {
			if (start != -1) {
				second = arr[i - 1] - arr[start];
				arr[i] = arr[i - 1] + second;
			} else {
				arr[i] = arr[i - 1];
			}
			start++;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
