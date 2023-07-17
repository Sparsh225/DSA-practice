package String;
//you are given a string and check if divided into two equal half they contain equal number of vowels
public class ALike {

	public static void main(String[] args) {
		String st = "Leetcode";
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		int n = st.length();
		int n1 = n / 2;
		String s1 = st.substring(0, n1);
		String s2 = st.substring(n1, n);
		System.out.println(s1);
		System.out.print(s2);
		int c1 = 0, c2 = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (s1.charAt(i) == arr[j]) {
					c1++;
				}
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (s2.charAt(i) == arr[j]) {
					c2++;
				}
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}

}
