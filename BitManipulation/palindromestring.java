package bitManipulation;

public class palindromestring {

	public static boolean ispalindromebit(String temp) {
		int i = 0;
		int j = temp.length() - 1;
		while (i < j) {
			if (temp.charAt(i) != temp.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcba";
		if (ispalindromebit(str)) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}

	}

}
