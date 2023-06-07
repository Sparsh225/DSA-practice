package technical;


public class recurPattern3 {

	static void printspace(int noofspace) {
		if (noofspace == 0) {
			return;
		}
		System.out.print(" ");
		printspace(noofspace - 1);
	}

	static void printstar(int noofstar) {
		if (noofstar == 0) {
			return;
		}
		System.out.print(" *");
		printstar(noofstar - 1);
	}

	static void printpattern(int rows, int cuurentrow) {
		if (rows == 0) {
			return;
		}
		printspace(rows - 1);
		printstar(cuurentrow);// print row
		System.out.println();// move into new line
		printpattern(rows - 1, cuurentrow + 1);
	}

	public static void main(String[] args) {
		printpattern(7, 1);

	}

}
