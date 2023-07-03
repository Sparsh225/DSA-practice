package technical;

import java.util.HashSet;

public class countdistinctinwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i/p : arr[] = {1,2,3,4,4,6,6,7,7}, k = 4
		// o/p : 4,3,3,2,3,2
		int arr[] = { 1, 2, 3, 4, 4, 6, 6, 7, 7 };
		int k = 4;
		for (int i = 0; i + k - 1 < arr.length; i++) {
			HashSet<Integer> map = new HashSet<>();
			// System.out.println(map.size());
			int count = 0;
			int j = i;
			while (count != k) {
				map.add(arr[j]);
				count++;
				j++;
			}
			System.out.print(map.size() + " ");
		}

	}

}
