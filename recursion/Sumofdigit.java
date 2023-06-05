package technical;

public class Sumofdigit {
	static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	static int recsum(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		sum = sum + n % 10;
		return recsum(n / 10, sum);

	}
	public static void main(String[] args) {
		System.out.println(sum(1234));
		System.out.print(recsum(1234, 0));
	}

}
