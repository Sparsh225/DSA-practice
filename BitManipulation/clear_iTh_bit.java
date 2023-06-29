package bitManipulation;

public class clear_iTh_bit {

	public static void main(String[] args) {
		int n = 13;
		int k = 2;
		int mask = k << 1;
		System.out.print(n ^ mask);
	}

}
