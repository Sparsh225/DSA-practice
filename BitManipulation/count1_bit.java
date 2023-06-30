package bitManipulation;

public class count1_bit {

	public static void main(String[] args) {
		int n = 38;
		int c = 0;
		while (n != 0) {
			int mask = n & 1;
			if (mask == 1) {
				c++;
			}
			n = n >> 1;
		}
		System.out.print("the count of 1 is " + c);
	}

}
