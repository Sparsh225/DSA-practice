package LinkedList;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}

public class ListNodeGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> start = new Node<>(20);
		start.next = new Node<>(30);
		start.next.next = new Node<>(40);
		start.next.next.next = new Node<>(50);

	}

}
