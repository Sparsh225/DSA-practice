package technical;

public class DoublyLinkedList {
	private Listnode head;
	private Listnode tail;
	private int length;

	private class Listnode {
		private Listnode pre;
		private Listnode next;
		private int data;

		public Listnode(int data) {
			this.data = data;
			this.next = null;
			this.pre = null;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public Listnode deletefirst() {
		Listnode temp=head;
		if(head==tail) {
			tail=null;
		}else {
			head.next.pre=null;
		}
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	public Listnode deletelast() {
		Listnode temp=head;
		if(head==tail) {
			head=null;
		}else {
			tail.pre.next=null;
		}
	    tail=tail.pre;
		temp.pre=null;
		return temp;
	}
	
	public void insertatfirst(int value) {
		Listnode newnode = new Listnode(value);
		if (head == null) {
			tail = newnode;
		} else {
			head.pre = newnode;
		}
		newnode.next = head;
		head = newnode;
		length++;
	}
	
	public void insertatlast(int value) {
		Listnode newnode = new Listnode(value);
		if (head == null) {
			head = newnode;
		} else {
			tail.next = newnode;
		}
		newnode.pre = tail;
		tail = newnode;
		length++;
	}

	public void displayforward() {
		if (head == null) {
			return;
		}
		Listnode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public void displaybackward() {
		if (tail == null) {
			return;
		}
		Listnode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.pre;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertatlast(1);
		dll.insertatlast(13);
		dll.insertatlast(23);
		dll.insertatlast(55);
		dll.insertatlast(63);
		dll.displayforward();System.out.println();
		dll.displaybackward();
	}

}
