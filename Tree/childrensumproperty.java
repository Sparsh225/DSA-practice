package BinaryTree;

public class childrensumproperty {

	boolean issum(binarytree<Integer> root) {
		if(root==null) {
			return true;
		}
		if(root.left==null && root.right==null) {
			return true;
		}
		
	    int sum=0;
	    if(root.left!=null) {
	    sum+=root.left.data;
	    }
	    if(root.right!=null) {
	    sum+=root.right.data;
	    }
		return (sum == root.data && issum(root.left) && issum(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
