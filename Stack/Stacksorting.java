package Stack;

import java.util.Stack;

public class Stacksorting {

	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> temp = new Stack<Integer>();
		while (!s.isEmpty()) {
			int current = s.pop();
			while (!temp.isEmpty() && current > temp.peek()) {
				s.push(temp.pop());
			}
			temp.push(current);
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(44);
		temp.push(98);
		temp.push(17);
		temp.push(36);
		Stack<Integer> s = sort(temp);
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}

	}

}
