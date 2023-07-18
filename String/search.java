package collection;

public class search {

	static int searchpattern(String word, String text) {
		int n = word.length();
		int m = text.length();
		for (int i = 0; i < n - m; i++) {
			String t = word.substring(i, i + m);
			System.out.println(t);
			if (text.equals(t)) {

				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(searchpattern("accdcdaa", "cda"));
	}

}

