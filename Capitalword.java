package technical;

public class Capitalword {

	static String[] result = new String[3];

	static String[] capital(String[] s, int i) {
		String word = "";
		if (s.length == i) {
			return result;
		}
		// System.out.print(i);
		for (int j = 0; j < s[i].length(); j++) {
			char letter = s[i].charAt(j);
			// System.out.print(letter);
			word = word + letter;
			
		}
		// System.out.print(word.toUpperCase());
		result[i] = word.toUpperCase();
		return capital(s, ++i);
	}

	public static void main(String[] args) {

		String[] s = { "foo", "bar", "world" };

		String[] result1 = capital(s, 0);
		for (String temp : result1) {
			System.out.print(temp + " ");
		}

	}

}
