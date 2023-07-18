package BinaryTree;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class verticalpair {
	binarytree<Integer> node = null;
	int h1 = 0;

	verticalpair(binarytree<Integer> node, int h1) {
		this.node = node;
		this.h1 = h1;
	}
}

public class verticaltree {

	static void verticaltraversal(binarytree<Integer> root) {
		LinkedList<verticalpair> queue = new LinkedList<>();
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> ans = new ArrayList<>();
		queue.addLast(new verticalpair(root, 0));
		int min=0,max=0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				
				verticalpair vp = queue.removeFirst();
				max=Math.max(max, vp.h1);
				min=Math.min(min, vp.h1);
				map.putIfAbsent(vp.h1, new ArrayList<>());
				map.get(vp.h1).add(vp.node.data);
				if(vp.node.left!=null) {
					queue.addLast(new verticalpair(vp.node.left,vp.h1-1));
				}
				if(vp.node.right!=null) {
					queue.addLast(new verticalpair(vp.node.right,vp.h1+1));
				}
			}

		}
		for (int i = min; i <= max; i++) {
			ans.add(map.get(i));
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree<Integer> root = new binarytree<>(10);
		root.left = new binarytree<>(20);
		root.right = new binarytree<>(30);
		root.left.left = new binarytree<>(40);
		root.left.right = new binarytree<>(50);
		root.right.right = new binarytree<>(60);
		root.right.right.left = new binarytree<>(70);
		verticaltraversal(root);
	}

}
