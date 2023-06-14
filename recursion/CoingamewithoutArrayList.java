package technical;

public class CoingamewithoutArrayList {

	public static void coin(int current, int target, String output) {
		if (current == target) {
			System.out.println(output + "");
			return;
		}
		if (current > target) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			coin(current + i, target, output + i);
		}
	}

	public static void main(String[] args) {
		coin(0, 10, "");

	}

}
