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
		System.out.println("delete first " + sll.deletefirst().data);
		sll.deletefirst();
		sll.print();
		System.out.println();
		System.out.println("delete last " + sll.deletelast().data);
		sll.print();
		System.out.println();
		System.out.println("delete any position " + sll.deleteanypos(3).data);
		sll.print();
		System.out.println();
		System.out.println("element present in the linkedlist " + sll.search(5));
	}
        
	public boolean search(int value) {
		Listnode temp = head;
		while (temp != null) {
			if (temp.data == value) {
				return true;
			}
			temp = temp.next;
		}
		return false;
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
	public Listnode deletefirst() {
		if(head==null) {return null;}
        Listnode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
}
	public Listnode deletelast() {
		if (head == null || head.next == null) {
			return head;
		}
		Listnode current = head;
		Listnode pre = null;
		while (current.next != null) {
			pre = current;
			current = current.next;
		}
		pre.next = null;
		return current;
	}
	
	public Listnode deleteanypos(int pos) {
		if (pos == 1) {
			head = head.next;
		} else {
			int count = 1;
			Listnode pre = head;
			while (count < pos - 1) {
				pre = pre.next;
				count++;
			}
			Listnode current = pre.next;
			pre.next = current.next;
			return current;
		}
		return null;
	}
}
