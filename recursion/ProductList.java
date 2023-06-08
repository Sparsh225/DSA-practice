package technical;

public class ProductList {
	static int pro = 1;
	static int product(int[] a, int i) {
		if (a.length == i) {
			return pro;
		}
		// System.out.println(pro);
		System.out.println(a[i]);
		pro = pro * a[i];
		return product(a, i + 1);
	}
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3 };
		int result = product(arr, 0);
		System.out.println("Product of array is " + result);
	}

}
