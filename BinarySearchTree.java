package technical;

public class BinarySearchTree {
	private Treenode root;
    public class Treenode{
    	private Treenode left;
    	private Treenode right;
    	private int data;
    	public Treenode(int data) {
    		this.data=data;
    	}
    }
    
    public Treenode insert(Treenode root,int data) {
    	if(root==null) {
    		root=new Treenode(data);
    		return root;
    	}
    	if(data < root.data) {
    		root.left=insert(root.left,data);
    	}else {
    		root.right=insert(root.right,data);
    	}
    	return root;
    }
	public static void main(String[] args) {
	

	}

}
