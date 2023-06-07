package technical;
/*Pattern-6
*
***
*****
*******
**********/

public class recurPattern6 {
	public static void Pattern(int str, int row, int sp) {
		if (row == 6) {
			return;
		}

		printSpace(sp);
		PrintStar(str);
		System.out.println();
		if (sp == 0) {
			Pattern(str + 2, row + 1, sp);
		} else {
			Pattern(str + 2, row + 1, sp - 1);
		}
	}

	public static void printSpace(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(" ");
		printSpace(n - 1);
	}

	public static void PrintStar(int n) {
		if (n == 0) {
			return;
		}
		System.out.print("*");
		PrintStar(n - 1);
	}

	public static void main(String[] args) {
		Pattern(1, 1, 4);
	}
}
