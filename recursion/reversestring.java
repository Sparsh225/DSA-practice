package technical;

public class reversestring {

	static String reverse(String originalStr) {
		String reversedStr = "";
		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}
		return reversedStr;
	}

	static String recreverse(String s) {
		if (s.length() == 1) {
			return String.valueOf(s.charAt(0));
		}

		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverse("bobby"));
		System.out.println(recreverse("bobby"));

	}

}
