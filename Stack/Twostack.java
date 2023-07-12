package Stack;

public class Twostack {

	int[] arr;
	int capacity;
	int top1, top2;

	Twostack(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		top1 = -1;
		top2 = capacity;

	}

	void push1(int x) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			throw new RuntimeException("Stack1 Overflow");
		}
	}

	void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		} else {
			throw new RuntimeException("Stack2 Overflow");
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			throw new RuntimeException("Stack1 Underflow");
		}
	}

	int pop2() {
		if (top1 <= capacity) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			throw new RuntimeException("Stack2 Underflow");
		}
	}

	int peek1() {
		if (top1 >= 0) {
			int x = arr[top1];

			return x;
		} else {
			throw new RuntimeException("Stack1 Underflow");
		}
	}

	int peek2() {
		if (top1 <= capacity) {
			int x = arr[top2];

			return x;
		} else {
			throw new RuntimeException("Stack2 Underflow");
		}
	}

	int size1() {
		return top1 + 1;
	}

	int size2() {
		return top2 + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
