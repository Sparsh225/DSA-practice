package technical;

import java.util.ArrayList;

public class diceGame {

	public static ArrayList<String> gamedice(int current, int target) {
		if (current == target) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
			
		}
		if (current > target) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		ArrayList<String> result = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			int newval = current + i;
			ArrayList<String> temp = gamedice(newval, target);
			for (String s : temp) {
				result.add(s + i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> res = gamedice(0, 10);
		System.out.println(res);
		System.out.println(res.size());
	}

}
