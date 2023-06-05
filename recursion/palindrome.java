package technical;

public class palindrome {

	static boolean ispalindrome(int num) {
		int rev = 0, temp = num;
		while (temp != 0) {
			int n = temp % 10;
			rev = n + rev * 10;
			temp = temp / 10;
		}
		System.out.print(rev);
		if (rev == num) {
			return true;
		} else {
			return false;
		}
	}

	static boolean recispalindrome(int num, int rev, int realnum) {
		if (rev == realnum) {
			return true;
		}
		if (num == 0) {
			return false;
		}

		int re = num % 10;
		rev = re + rev * 10;
		// System.out.println(rev);
		// System.out.println(temp);
		return recispalindrome(num / 10, rev, realnum);
	}

	public static void main(String[] args) {
		// System.out.println(ispalindrome(111));
		// System.out.println(ispalindrome(133));
		System.out.println(recispalindrome(111, 0, 111));
		System.out.println(recispalindrome(133, 0, 133));
	}

}
