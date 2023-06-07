package technical;

public class recurPattern4 {
	static int count = 0;

	static void printnum(int num) {
		if (num == 0) {
			return;
		}
		System.out.print(++count);
		printnum(--num);
	}

	static void printpattern(int rows, int num) {
		if (rows == 0) {
			return;
		}
		printnum(num);
		System.out.println();
		printpattern(rows - 1, num + 1);
	}

	public static void main(String[] args) {
		// print();
		printpattern(4, 1);
	}

}
