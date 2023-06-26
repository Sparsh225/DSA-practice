package technical;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 2, 5, 4, 1 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int sum2 = (a.length * (a.length + 1)) / 2;
		System.out.print("the missing number is " + (sum2 - sum));
	}

}
