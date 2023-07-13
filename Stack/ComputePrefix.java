package Stack;

import java.util.Stack;

public class ComputePrefix {

	static int computeprefix(String s) {
		Stack<Integer> stack = new Stack<>();
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
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
		String s = "+*544";
		System.out.print(computeprefix(s));

	}

}
