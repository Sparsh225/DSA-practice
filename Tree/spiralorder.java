package BinaryTree;

import java.util.Stack;

public class spiralorder {
	void printspiral(binarytree<Integer> root) {
		if (root == null) {
			return;
		}
		Stack<binarytree<Integer>> oddstack = new Stack<>();
		Stack<binarytree<Integer>> evenstack = new Stack<>();
		oddstack.push(root);
		while (!oddstack.isEmpty() || !evenstack.isEmpty()) {
			while (!oddstack.isEmpty()) {
				binarytree<Integer> temp = oddstack.peek();
				oddstack.pop();
				System.out.print(temp.data + " ");
				if (temp.right != null) {
					evenstack.push(temp.right);
				}
				if (temp.left != null) {
					evenstack.push(temp.left);
				}
			}
			while (!evenstack.isEmpty()) {
				binarytree<Integer> temp = evenstack.peek();
				evenstack.pop();
				System.out.print(temp.data + " ");
				if (temp.left != null) {
					oddstack.push(temp.left);
				}
				if (temp.right != null) {
					oddstack.push(temp.right);
				}

			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
