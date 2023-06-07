package technical;

/*A
BB
CCC
DDDD
EEEEE*/
public class recurPattern5 {
	static char ch = 'A';
	static void printchar(int j) {
		if (j == 0) {
			return;
		}
		System.out.print(ch);
		printchar(j - 1);
	}

	static void printPattern(int rows, int j) {
		if (rows == 0) {
			return;
		}
		printchar(j);
		ch++;
		System.out.println();
		printPattern(rows - 1, j + 1);
	}
	public static void main(String[] args) {

		printPattern(5, 1);
	}

}
