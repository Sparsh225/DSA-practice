package Stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String s = "rahul";
		Stack<Character> stack = new Stack<>();
		char[] a = s.toCharArray();
		for (char ch : a) {
			stack.push(ch);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(stack.pop());
		}
	}

}
