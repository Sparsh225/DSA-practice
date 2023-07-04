package String;

import java.util.ArrayList;

public class printsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		ArrayList<String> sub = new ArrayList<>();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char firstchar = str.charAt(i);
			if (sub.size() == 0) {
				sub.add(" ");
				sub.add(" " + firstchar);
				continue;
			}
			int sublen = sub.size();
			for (int j = 0; j < sublen; j++) {
				String temp = sub.get(j) + firstchar;
				sub.add(temp);
			}
		}
		System.out.print(sub + " ");
	}

}
