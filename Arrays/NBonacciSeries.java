package technical;

public class NBonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i/p : n = 3, nthTerm = 15
		// o/p : 0,0,1,1,2,4,7,13,24,44,81,149,274,504
		int sum = 0, f = 0, s = 0, t = 1, nt = 15, k = 3;

		int nth = 9;
		while (nth != nt) {
			for (int m = 0; m < k; m++) {
				System.out.print(f + " ");
				sum = f + s + t;
				f = s;
				s = t;
				t = sum;
		}
		nth++;
		}
	}

}
