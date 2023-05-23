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
		
		System.out.println();
		System.out.println("Insert end linkedlist ");
		sll.insertend(50);
		sll.print();
		System.out.println();
		System.out.println("Insert at any position linkedlist ");
		sll.insertatpos(3, 44);
		sll.print();
		System.out.println();
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
	
	public void insertend(int value) {
		Listnode newnode = new Listnode(value);
		Listnode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;

	}
	public void insertatpos(int pos, int value) {
		Listnode newnode = new Listnode(value);
		if (pos == 1) {
			newnode.next = head;
			head = newnode;
		} else {
			Listnode pre = head;
			int count = 1;
			while (count < pos - 1) {
				pre = pre.next;
				count++;
			}
			newnode.next = pre.next;
			pre.next = newnode;
                    }
		}
}
