package BinaryTree;


public class printancestor {

	boolean print(binarytree<Integer> root, int target) {
		if (root == null) {
			return false;
		}
		if (root.data == target) {
			return true;
		}
		if (print(root.left, target) || print(root.right, target)) {
			System.out.print(root.data + " ");
			return true;
		}
		return false;
	}

}
