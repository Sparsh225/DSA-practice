package technical;

public class Queue {
	private Listnode rear;
	private Listnode front;
	private int length;

	Queue() {
		this.rear = null;
		this.front = null;
		this.length = 0;
	}

	private class Listnode {
		int data;
		Listnode next;

		public Listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqeue(int data) {
		Listnode newnode = new Listnode(data);
		if (isEmpty()) {
			front = newnode;
		} else {
			rear.next = newnode;
		}
		rear = newnode;
		length++;
	}

	public void print() {
		if (isEmpty()) {
			return;
		}
		Listnode temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqeue(12);
		q.enqeue(32);
		q.enqeue(55);
		q.enqeue(64);
		q.enqeue(22);
		q.print();
	}

}
