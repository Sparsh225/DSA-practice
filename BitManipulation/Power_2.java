package bitManipulation;

public class Power_2 {

	public static void main(String[] args) {
		int n = 8;
		if ((n & n - 1) == 0) {
			System.out.print("power of 2 is true");
		} else {
			System.out.print("power of 2 is false");
		}

	}

}
