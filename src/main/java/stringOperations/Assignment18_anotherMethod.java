package stringOperations;

public class Assignment18_anotherMethod {

	public static boolean isPalindrome(String s) { // Method to check if a string is a palindrome
		// Convert to lowercase and remove non-alphanumeric characters
		String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize string: lowercase and remove anything
																		// that's not a letter or digit

		// Reverse the string
		String reversed = ""; // Initialize an empty string to build the reversed version
		for (int i = cleaned.length() - 1; i >= 0; i--) { // Loop from the end of the cleaned string to the start
			reversed += cleaned.charAt(i); // Append each character in reverse order
		}

		// Compare original cleaned with reversed
		return cleaned.equals(reversed); // Return true if cleaned string is the same forwards and backwards
	}

	public static void main(String[] args) {
		String input1 = "A man, a plan, a canal: Panama";
		String input2 = "race a car";
		String input3 = "Madam";

		System.out.println("Is Palindrome? " + isPalindrome(input1)); // true
		System.out.println("Is Palindrome? " + isPalindrome(input2)); // false
		System.out.println("Is Palindrome? " + isPalindrome(input3)); // true
	}
}
