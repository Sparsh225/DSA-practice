package technical;

public class recuPattern2 {

	static void printstar(int noofstar) {
		if (noofstar == 0) {
			return;
		}
		System.out.print("*");
		printstar(noofstar - 1);
	}

	static void printpattern(int rows, int cuurentrow) {
		if (rows == 0) {
			return;
		}
		printstar(cuurentrow);// print row
		System.out.println();// move into new line
		printpattern(rows - 1, cuurentrow - 1);
	}

	public static void main(String[] args) {
		printpattern(5, 5);

	}

}
