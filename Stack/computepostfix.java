package Stack;

import java.util.Stack;

public class computepostfix {

	static int computepostfix(String s) {
		Stack<Integer> stack = new Stack<>();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char current = s.charAt(i);
			if (Character.isDigit(current)) {
				stack.push(Character.getNumericValue(current));
			} else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				int ans = 0;
				switch (current) {
				case '+': {
					ans = num1 + num2;
					break;
				}
				case '-': {
					ans = num1 - num2;
					break;
				}
				case '*': {
					ans = num1 * num2;
					break;
				}
				case '/': {
					ans = num1 / num2;
					break;
				}
				case '%': {
					ans = num1 % num2;
					break;
				}
				case '^': {
					ans = (int) Math.pow(num1, num2);
					break;
				}
				}
				stack.push(ans);
			}

		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "544*+";
		System.out.print(computepostfix(s));
	}

}
