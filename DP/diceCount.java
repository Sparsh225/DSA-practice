package dynamic;

public class diceCount {

	static int countways(int cur, int target, int[] cache) {
		if (cur == target) {
			return 1;
		}
		if (cur > target) {
			return 0;
		}
		if (cache[cur] != 0) {
			return cache[cur];
		}
		int count = 0;
		for (int val = 1; val <= 6; val++) {
			count = count + countways(cur + val, target, cache);
		}
		cache[cur] = count;
		return count;
	}

	static int countwaystab(int start, int end) {
		int[] cache = new int[end + 1];
		cache[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
				count += cache[dice + i];
			}
			cache[i] = count;
		}
		return cache[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 10;
		int[] cache = new int[target + 1];
		int output = countways(0, target, cache);
		System.out.print(output);
		output = countwaystab(0, target);
		System.out.print(output);
	}

}
