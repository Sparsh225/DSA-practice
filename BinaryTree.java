package technical;

public class BinaryTree {
	Treenode root;

	BinaryTree() {
		this.root = null;
	}

	public class Treenode {
		private Treenode left;
		private Treenode right;
		private int data;

		public Treenode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		Treenode first = new Treenode(22);
		Treenode second = new Treenode(22);
		Treenode third = new Treenode(22);
		Treenode fourth = new Treenode(22);
		Treenode fifth = new Treenode(22);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
