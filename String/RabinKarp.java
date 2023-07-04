package String;

public class RabinKarp {

	static long hashvalue(String str) {
		int m = str.length();
		long hash = 0;
		for (int i = 0; i < m; i++) {
			hash += str.charAt(i) * Math.pow(10, i);
		}
		return hash;
	}

	// search pattern
	static int searchpattern(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		long patternhash = hashvalue(pattern);
		for (int i = 0; i <= n - m; i++) {
			long texthash = hashvalue(text.substring(i, i + m));
			if (patternhash == texthash && pattern.equals(text.substring(i, i + m))) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abc";
		System.out.print(searchpattern("accdcdaa", "cda"));
		// hash function
	}

}
