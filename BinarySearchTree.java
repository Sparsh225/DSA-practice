package technical;

public class BinarySearchTree {
	private Treenode root;

	public class Treenode {
		private Treenode left;
		private Treenode right;
		private int data;

		public Treenode(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public Treenode insert(Treenode root, int data) {
		if (root == null) {
			root = new Treenode(data);
			return root;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(Treenode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public Treenode search(Treenode root,int key) {
		if(root==null || root.data==key) {
			return root;
		}
		if(key<root.data) {
			return search(root.left,key);
		}else{
			return search(root.right,key);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(3);
		bst.insert(1);
		bst.insert(6);
		bst.insert(5);
		bst.insert(7);
		bst.inorder();
	}

}
