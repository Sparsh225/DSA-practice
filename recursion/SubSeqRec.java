package technical;

import java.util.ArrayList;

public class SubSeqRec {

	static ArrayList<String> solutionR(String str) {
		if (str.length() == 0) {
			ArrayList<String> a = new ArrayList<>();
			a.add("");
			return a;
		}
		char current = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String> temp = solutionR(remaining);
		ArrayList<String> solution = new ArrayList<>();
		for (String s : temp) {
			solution.add(s);
			solution.add(current + s);
		}
		return solution;
	}

	public static void main(String[] args) {
		String str = "ravi";
		ArrayList<String> output = solutionR(str);
		System.out.println(output);
	}

}
