package stringOperations;

public class Assignment18 {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama"; // Initialize the variable

		String cleaned = input.replaceAll("[ ,:]", "").toLowerCase(); // Remove space, comma, and colon, then convert to Lowercase
																		

		boolean isPalindrome = true; // Initialize the variable by true
		int len = cleaned.length(); // Store the length of the final/cleaned string

		for (int i = 0; i < len / 2; i++) { // Start the loop from 0 to half of total length

			if (cleaned.charAt(i) != cleaned.charAt((len - 1) - i)) { // Check cleaned string is a Palindrome or Not
				isPalindrome = false;
				break;
			}
		}

		System.out.println("Cleaned String: " + cleaned); // Print cleaned text
		System.out.println("Is Palindrome? " + isPalindrome); //Print final result
	}
}
