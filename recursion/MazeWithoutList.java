package technical;

public class MazeWithoutList {

	public static void maze(int currow, int curcol, int endrow, int endcol, String output) {
		if (currow == endrow && curcol == endcol) {
			System.out.println(output);
			return;
		}
		if (currow > endrow || curcol > endcol) {
			return;
		}
		// horizontal
		maze(currow + 1, curcol, endrow, endcol, output + "H");
		maze(currow, curcol + 1, endrow, endcol, output + "V");
	}

	public static void main(String[] args) {
		maze(0, 0, 2, 2, "");

	}

}
