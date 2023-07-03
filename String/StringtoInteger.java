package String;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    -296";
		int i = 0;
		int sign = 1;
		int r = 0;
		// spacees
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		// sign
		if (i < s.length() && s.charAt(i) == '-') {
			sign = -1;
			i++;
		} else {
			if (i < s.length() && s.charAt(i) == '+') {
				sign = 1;
				i++;
			}
		}
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0';
			if (r >= Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
				System.out.print(sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
			} else {
				if (r <= Integer.MIN_VALUE / 10) {
					System.out.print(Integer.MIN_VALUE);
				}
			}
			r = r * 10 + digit;
			i++;
		}

		System.out.print(r * sign);

	}

}
