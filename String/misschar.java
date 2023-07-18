package String;

public class misschar {
	public static void main(String[] args) {
		String input = "abcdefghijklmnopqrz"; // Input string

		String missingLetters = findMissingLetters(input);

		System.out.println("Missing letters: " + missingLetters);
	}

	public static String findMissingLetters(String input) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder missingLetters = new StringBuilder();

		// Convert input string to lowercase
		input = input.toLowerCase();

		// Iterate through each letter in the alphabet
		for (int i = 0; i < alphabet.length(); i++) {
			char letter = alphabet.charAt(i);

			// Check if the letter is missing in the input string
			if (!input.contains(String.valueOf(letter))) {
				missingLetters.append(letter);
			}
		}

		return missingLetters.toString();
	}
}