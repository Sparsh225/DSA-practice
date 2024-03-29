package technical;

import java.util.Stack;

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
		Treenode second = new Treenode(33);
		Treenode third = new Treenode(11);
		Treenode fourth = new Treenode(42);
		Treenode fifth = new Treenode(26);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
	}

	public void preorder(Treenode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public void Inorder(Treenode root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		System.out.print(root.data + " ");
		preorder(root.right);
	}

	public void postorder(Treenode root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data + " ");
	}

	// preorder iterative

	public void preorderit(Treenode root) {
		if (root == null) {
			return;
		}
		Stack<Treenode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			Treenode temp = s.pop();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				s.push(temp.left);
			}
			if (temp.right != null) {
				s.push(temp.right);
			}
		}
	}
 
       // Inorder iterative	
	public void inorderit(Treenode root) {
		if(root==null) return;
		Stack<Treenode> stack=new Stack<>();
		Treenode temp=root;
		while(temp!=null || !stack.isEmpty()) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}else {
				temp=stack.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
		
		
		
	
	public static int maxtree(Treenode root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = maxtree(root.left);
		int right = maxtree(root.right);
		if (result < left) {
			result = left;
		}
		if (result < right) {
			result = right;
		}
		return result;
	}

	public void levelorder(Treenode root) {
		if (root == null) {
			return;
		}
		Queue<Treenode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			Treenode temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b = new BinaryTree();
		b.createBinaryTree();
		b.preorder(b.root);
		System.out.println();
		b.preorderit(b.root);
		System.out.println("Post order");
		b.postorder(b.root);
		System.out.println("In order");
		b.Inorder(b.root);
	}

}
