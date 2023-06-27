package technical;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 2, 1, 1, 2, 2, 2, 2 };
		int n1=a.length;
		int count = 0, majority = 0;
		for (int i = 0; i < a.length; i++) {
			if (count == 0) {
				majority = a[i];
			}
			if (majority == a[i]) {
				count++;
			} else {
				count--;
			}
		}
		System.out.print("" + majority);
	}


}
