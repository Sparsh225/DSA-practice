package bitManipulation;

public class clearLast_I_th_bit {

	public static void main(String[] args) {
		int n = 13;
		int k = 2;
		int mask = ~0 << k;
		System.out.print(n & mask);

	}

}
