package technical;

public class SubSequenceitr {

	public static void substr(String str, String result) {
		if (str.length() == 0) {
			System.out.print(result + " ");
			return;
		}

		char current = str.charAt(0);
		String remaining = str.substring(1);
		substr(remaining, result);
		substr(remaining, result + current);
	}

	public static void main(String[] args) {
		substr("Ravi", "");

	}

}
