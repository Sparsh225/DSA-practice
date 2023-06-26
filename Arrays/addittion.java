package technical;

public class addittion {

	public static void main(String[] args) {
		int[] a = { 1, 8, 9, 2 };
		int[] b = { 9, 1, 2, 7 };
		int n1 = a.length;
		int n2 = b.length;
		int n3 = n1 > n2 ? n1 : n2;
		int[] c = new int[n3 + 1];
		int k = c.length - 1;
		int i = a.length - 1;
		int j = b.length - 1;
		int sum = 0, carry = 0;
		while (k > 0) {
			if (i >= 0 && j >= 0) {
				sum = a[i] + b[j] + carry;
			} else if (i >= 0 && j < 0) {
				sum = a[i] + carry;
			} else if (j >= 0 && i < 0) {
				sum = b[j] + carry;
			}
			carry = sum / 10;
			sum = sum % 10;
			c[k] = sum;
			i--;
			j--;
			k--;
		}
		if (carry != 0) {
			c[0] = carry;
		}
		if (carry == 0) {

		}

			for (int r : c) {
				System.out.print(r + ",");
			}


	}

}
