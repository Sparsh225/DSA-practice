package BinaryTree;

import java.util.LinkedList;

public class leftview {
	static int max = 0;

	static void leftview(binarytree<Integer> root, int level) {
		if (root == null) {
			return;
		}
		if (max < level) {
			System.out.print(root.data + " ");
			max = level;
		}
		leftview(root.left, level + 1);
		leftview(root.right, level + 1);
	}

	static void leftviewitr(binarytree<Integer> root) {
		if (root == null) {
			return;
		}
		LinkedList<binarytree<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				binarytree<Integer> currentnode = queue.removeFirst();
				if (i == 0) {
					System.out.print(root.data);
				}
				if (currentnode.left != null) {
					queue.addLast(currentnode.left);
				}
				if (currentnode.right != null) {
					queue.addLast(currentnode.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
