package bitManipulation;

public class update_i_th_bit {

	public static void main(String[] args) {
		//update = clear+set
		int n = 22;
		int i = 2;
		int b = 0;
		int mask = b << i;
		int newnum = (n | mask);
		int mask2 = b << i;
		System.out.print(newnum | mask2);

	}

}
