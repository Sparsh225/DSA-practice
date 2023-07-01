package bitManipulation;

public class question2 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			if ((n & i) == i) {
				System.out.print(i + " ");
			}
		}

	}

}
