package String;

import java.util.HashMap;

public class Uniquechar {
	static void firstchar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < n; i++) {
			if (map.get(s.charAt(i)) == 1) {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbboooghhhh";
		firstchar(s);
	}

}
