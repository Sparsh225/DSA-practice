package String;

public class computeweightarray {
	static int[] compute(String pattern) {
		int length[] = new int[pattern.length()];
		int len = 0;
		int j = 1;
		length[0] = 0;
		while (j < pattern.length()) {
			if (pattern.charAt(j) == pattern.charAt(len)) {
				len++;
				length[j] = len;
				j++;
			} else {
				if (len != 0) {
					len = length[len - 1];
				} else {
					length[j] = 0;
					j++;
				}
			}
		}
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abcabecabd";
		int[] res = compute(pattern);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}
