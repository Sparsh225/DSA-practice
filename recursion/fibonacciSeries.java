package technical;

public class fibonacciSeries {
	// 0 1 1 2 3 5 8 13
	// 0 1 2 3 4 5 --> indexx
	static int fib(int n) {// return index of n element
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);// multiple recurrsion

	}
	public static void main(String[] args) {
		System.out.print(fib(21));
	}
}
