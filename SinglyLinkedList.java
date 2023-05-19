package technical;

public class SinglyLinkedList {

	private Listnode head;

	private static class Listnode {
		private int data;
		private Listnode next;

		public Listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new Listnode(12);
		// Listnode first=new Listnode(3);
		Listnode second = new Listnode(13);
		Listnode third = new Listnode(27);
		Listnode fourth = new Listnode(14);

		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.print();
		System.out.println();
		System.out.println("Length of linkedlist " + sll.length());

		System.out.println("Insert first linkedlist ");
		sll.insertfirst(0);
		sll.print();
	}

	public void print() {
		Listnode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--> ");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public int length() {
		int count = 0;
		Listnode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insertfirst(int value) {
		Listnode newnode = new Listnode(value);
		newnode.next = head;
		head = newnode;
	}
}
