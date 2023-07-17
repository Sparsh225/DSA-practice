package BinaryTree;

public class height {

	int Height(binarytree<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftheigth = Height(root.left);
		int rightheigth = Height(root.right);
		return 1 + Math.max(leftheigth, rightheigth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
