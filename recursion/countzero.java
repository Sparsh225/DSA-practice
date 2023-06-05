package technical;

public class countzero {
	static int czero(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 10 == 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

	static int recczero(int n, int c) {
		if (n == 0) {
			return c;
		}
		if (n % 10 == 0) {
			c++;
		}
		return recczero(n / 10, c);
	}

	public static void main(String[] args) {
		System.out.println(czero(10200404));
		System.out.println(recczero(1025300004, 0));
	}

}
