package technical;

import java.util.ArrayList;

public class SubSeqIter {

	static ArrayList<String> solution(String str) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (list.size() == 0) {
				list.add("");
				list.add("" + current);
			}
			int n = list.size();
			for (int j = 0; j < n; j++) {
				String temp = list.get(j) + current;
				if (!list.contains(temp)) {
					list.add(temp);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String str = "ravi";
		ArrayList<String> output = solution(str);
		System.out.println(output);

	}

}
