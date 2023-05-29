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

	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int result=front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
	}
	
	String [] generatebinarynumber(int n) {
		Queue<String> q=new LinkedList<>();
		String [] result=new String[n];
		q.offer("1");
		for(int i=0;i<n;i++) {
			result[i]=q.poll();
			String n1=result[i]+"0";
			String n2=result[i]+"1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
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
		System.out.println();
	    q.dequeue();
	    q.dequeue();
	    q.dequeue();
		q.print();
	}
	}

