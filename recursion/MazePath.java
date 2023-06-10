package technical;

import java.util.ArrayList;

public class MazePath {

	static ArrayList<String> getmaze(int currentrow, int currentcol, int endrow, int endcol) {
		if (currentrow == endrow && currentcol == endcol) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add(" ");
			return temp;
		}

		if (currentrow > endrow || currentcol > endcol) {
			ArrayList<String> temp = new ArrayList<>();
			return temp;
		}
		ArrayList<String> result = new ArrayList<>();

		ArrayList<String> verticalresult = getmaze(currentrow + 1, currentcol, endrow, endcol);
		for (String s : verticalresult) {
			result.add("V" + s);
		}
		
		
		ArrayList<String> diagonalresult = getmaze(currentrow + 1, currentcol + 1, endrow, endcol);
		for (String s : diagonalresult) {
			result.add("D" + s);
		}

		ArrayList<String> horizontailresult = getmaze(currentrow, currentcol + 1, endrow, endcol);
		for (String s : horizontailresult) {
			result.add("H" + s);
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> res = getmaze(0, 0, 2, 2);
		System.out.println(res);
	}

}
