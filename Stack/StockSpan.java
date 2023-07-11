package Stack;

public class StockSpan {

	static int[] fun(int[] arr) {
		int n = arr.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int c = 1;
			int j = i - 1;
			while (j >= 0 && arr[j] <= arr[i]) {
				c++;
				j--;
			}
			res[i] = c;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 60, 50, 40, 88, 95, 12 };
		int[] res = fun(arr);
		for (int n : res) {
			System.out.print(n + " ");
		}
	}

}
