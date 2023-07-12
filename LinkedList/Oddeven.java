package LinkedList;

public class Oddeven {

	private static Listnode head;

	private static class Listnode {
		private int data;
		private Listnode next;

		public Listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void print(Listnode head) {
		Listnode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}



	public static void main(String[] args) {
		Oddeven sll = new Oddeven();
		sll.head = new Listnode(12);
		// Listnode first=new Listnode(3);
		Listnode second = new Listnode(13);
		Listnode third = new Listnode(27);
		Listnode fourth = new Listnode(14);
		Listnode fifth = new Listnode(48);

		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		sll.print(head);
		Listnode temp = head;
		Listnode dummy = new Listnode(0);
		Listnode temp1 = dummy;
		Listnode dummy2 = new Listnode(0);
		Listnode temp2 = dummy2;
		int i = 1;
		System.out.println("oddd");
		while (temp != null) {
			// System.out.print(i);
			if (i % 2 != 0) {
				// System.out.println(temp.data);
				Listnode newnode = new Listnode(temp.data);

				temp1.next = newnode;
				temp1 = newnode;
			}
			else {
				Listnode newnode = new Listnode(temp.data);
				temp2.next = newnode;
				temp2 = newnode;
			}
			temp = temp.next;
			i++;
		}
		sll.print(dummy.next);
		System.out.println("even");
		sll.print(dummy2.next);
	}

}
