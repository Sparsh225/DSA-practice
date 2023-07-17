package BinaryTree;

public class NodesinbinaryTree {

	int countNode(binarytree<Integer> root) {
		if (root == null) {
			return 0;
		}
		int counter = 0;
		counter += countNode(root.left);
		counter += countNode(root.right);
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
