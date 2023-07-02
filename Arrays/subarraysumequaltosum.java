package technical;

public class subarraysumequaltosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50, 60 };
		int sum = 90;
		for (int i = 0; i < a.length - 1; i++) {
			int j = i + 1, sum1 = 0;
			while (sum1 < sum && j != a.length) {
				sum1 = sum1 + a[j];
				if (sum1 == sum) {
					System.out.println("the sub index start and end " + (i + 1) + " " + j);

				}
				j++;
			}
		}
	}

}
