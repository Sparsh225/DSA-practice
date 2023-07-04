package String;

public class suffix {
	public static void main(String[] args) {
		String str = "brain";
		int n = str.length();
		String[] suffix = new String[n];
		for (int i = 0; i < n; i++) {
			suffix[i] = str.substring(n - 1 - i);
		}
		for (String s : suffix) {
			System.out.print(s + " ");
		}
	}
}
