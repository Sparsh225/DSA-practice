package bitManipulation;

public class patternmatching {

	static int patternmatching(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		for (int i = 0; i <= n - m; i++) {
			int j = 0;
			while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
				j++;
			}
			if (j == m) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "aaaaaaaaaaaaab";
		String pattern = "aaab";
		int res = patternmatching(text, pattern);
		System.out.print(res);
	}

}
