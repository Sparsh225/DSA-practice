package bitManipulation;

public class Getibit {

	public static void main(String[] args) {
		int n = 12;
		int k = 3;
		int mask = k << 1;
		if ((n & mask) > 0) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

	}

}
