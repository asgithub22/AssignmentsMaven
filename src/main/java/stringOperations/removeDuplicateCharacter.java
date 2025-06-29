package stringOperations;

public class removeDuplicateCharacter {

	public static void main(String[] args) {
		String input = "Akash";
		String input1 = input.toLowerCase();
		String result = "";

		for (int i = 0; i < input1.length(); i++) { // loop start from ith position to till length of string
			char ch = input1.charAt(i); // extract the character one by one

			// Add character only if it's not already in the result
			if (!result.contains(String.valueOf(ch))) {
				result += ch;
			}
		}

		System.out.println("Original: " + input1); // print original string
		System.out.println("Without duplicates: " + result); // print duplicate removed string

	}

}
