package technical;

public class countdigits {
	static int count(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n = n / 10;
		}
		return c;
	}

	static int reccount(int n, int c) {
		if (n == 0) {
			return c;
		}
		return reccount(n / 10, ++c);
	}
	public static void main(String[] args) {

		System.out.println(count(12344));
		System.out.println(reccount(125344, 0));
	}

}
