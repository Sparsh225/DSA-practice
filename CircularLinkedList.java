package technical;

public class CircularLinkedList {
 
	private Listnode last;
	private int length;

	public class Listnode {
		private Listnode next;
		private int data;

		public Listnode(int data) {
			this.data = data;
		}
	}

	public CircularLinkedList() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
	
	public void insertatfirst(int data) {
		Listnode temp=new Listnode(data);
		if(last==null) {
			last=temp;
		}else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}

	public void insertatlast(int data) {
		Listnode temp=new Listnode(data);
		if(last==null) {
		    last=temp;
		    last.next=last;
		}else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}


	public void createcircularlist() {
		Listnode first = new Listnode(1);
		Listnode second = new Listnode(23);
		Listnode third = new Listnode(55);
		Listnode fourth = new Listnode(66);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;

	}

	public static void main(String[] args) {
		CircularLinkedList csl = new CircularLinkedList();
		csl.createcircularlist();
	}

}
