package technical;

import java.util.Arrays;
import java.util.HashMap;

public class smallernumberarry {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 1, 2, 2, 3 };
		Arrays.sort(a);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			map.putIfAbsent(a[i], i);

		}
		int[] out = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			out[i] = map.get(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(out[i] + " ");
		}
	}

}
