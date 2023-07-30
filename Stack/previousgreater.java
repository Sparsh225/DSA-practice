package Stack;

import java.util.Stack;

public class previousgreater {
	public static void main(String[] args) {
		int[] arr = { 50, 20, 44, 21, 55, 65, 23, 11, 88 };
		int res[] = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}
			res[i] = s.isEmpty() ? -1 : arr[s.peek()];
			s.push(i);
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
