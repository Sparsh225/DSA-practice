package technical;

public class armstrong {

	static boolean armstrong(int n) {
		int result = 0;
		while (n != 0) {
			int re = result % 10;
			result = result + re * re * re;
			n = n / 10;
		}
		if (result == n) {
			return true;
		}
		return false;
	}

	static boolean recarmstrong(int n, int result) {
		if (n == result) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		int rem = result % 10;
		result = result + rem * rem * rem;
		return recarmstrong(n / 10, result);
	}

	public static void main(String[] args) {
		System.out.println(armstrong(153));
		System.out.println(recarmstrong(153, 0));
	}

}
