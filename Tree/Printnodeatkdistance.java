package BinaryTree;

public class Printnodeatkdistance {

	void print(binarytree<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.print(root.data + " ");
		} else {
			print(root.left, k - 1);
			print(root.right, k - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
