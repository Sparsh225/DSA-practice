package String;

public class prefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "joker";
		for (int i = 0; i <= str.length(); i++) {
			
			String temp = str.substring(0, i);
			System.out.print(temp + ' ');
			
		}
	}

}
