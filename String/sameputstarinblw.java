package String;

public class sameputstarinblw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcc";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				String temp = s.charAt(i) + "*" + s.charAt(i + 1);
				System.out.print(temp);
			}
		}
	}

}
