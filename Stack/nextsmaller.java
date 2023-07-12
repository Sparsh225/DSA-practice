package Stack;

import java.util.Stack;

public class nextsmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 60, 50, 40, 95, 80 };
		int[] res = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			res[i] = s.isEmpty() ? -1 : arr[s.peek()];
			s.push(i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
