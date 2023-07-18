package BinaryTree;

public class constructsumtree {

	public int sumtree(binarytree<Integer> root) {
		if (root == null) {
			return 0;
		}
		int left = sumtree(root.left);
		int right = sumtree(root.right);
		int cur = root.data;
		root.data = left + right;
		return cur + right + left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
