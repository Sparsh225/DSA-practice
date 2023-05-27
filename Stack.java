package technical;

public class Stack {
	Listnode top;
	int length;

	public class Listnode {
		Listnode next;
		int data;

		Listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int value) {
		Listnode temp = new Listnode(value);
		temp.next = top;
		top = temp;
		length++;
	}

	public int pop() {
		int temp = top.data;
		top = top.next;
		length--;
		return temp;
	}

	public int peek() {
		return top.data;
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(0);
		s.push(33);
		s.push(45);
		s.push(77);
		System.out.print(s.peek());
	}

}
