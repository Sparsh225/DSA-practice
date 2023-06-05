package technical;

public class prime {
	static boolean isprime(int num) {
		for (int i = 2; i * i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean recisprime(int n, int i) {
		if (n <= 2) {
			return (n == 2) ? true : false;
		}
		if (n % i == 0) {
			return false;
		}
		if (i * i > n) {
			return true;
		}

		// Check for next divisor
		return recisprime(n, i + 1);

	}
	public static void main(String[] args) {
		System.out.println(isprime(124));
		System.out.println(recisprime(99, 2));

	}

}
