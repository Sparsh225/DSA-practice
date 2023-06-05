package technical;

public class powercom {

	static int power(int n, int pow) {
		int result = 1;
		for (int i = 1; i <= pow; i++) {
			result = result * n;
		}
		return result;
	}

	static int recpower(int n, int pow) {
		if (pow == 0) {
			return 1;
		}

		return recpower(n, pow - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 5));
		System.out.println(recpower(2, 5));
	}

}
