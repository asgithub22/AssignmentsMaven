package defaultFunctionalInterfaces;

import java.util.function.Function;

public class defaultFunctionalInterfacesClassFunctionMethod {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";
		double x = 3; // Base number (can be any real number)
		int n = 2; // Exponent (can be negative, zero, or positive)

		// Function to count total number of words
		Function<String, Integer> wordCount = str -> str.split(" ").length; // count the number of words in a sentence
		System.out.println("Count of words: " + wordCount.apply(sentence)); // Print total number of words in the given
																			// sentence

		// Function to reverse the sentence
		Function<String, String> wordCount2 = str2 -> {
			String[] words = str2.split(" "); // Split the words from the space of sentences and store in variable
			String reverseSentence = ""; // Initialize the variable from space
			for (int i = words.length - 1; i >= 0; i--) { // Initialize the i from total length of sentence -1 to till 0
				reverseSentence = reverseSentence + words[i] + " "; // Append words in reverse order
			}
			return reverseSentence;
		};

		System.out.println("Reverse Sentence is: " + wordCount2.apply(sentence)); // Print the reverse order of sentence
		
		//Function to print Power of N 
		Function<Integer, Double> power = exponent -> {
			double base = x;
			int exp = exponent;
			double res = 1;

			// Case 1: If exponent is zero, any number raised to power 0 is 1
			if (n == 0) {
				res = 1;
			}
			// Case 2: If exponent is negative
			if (exp < 0) {
				base = 1 / base;
				exp = -exp;
			}
			// Loop to multiply the base 'x', 'n' times
			for (int i = 0; i < exp; i++) {
				res *= base; // Multiply result with base 'x' in each iteration
			}

			return res;
		};

		System.out.println("Power is: " + power.apply(n)); // Print the final result
	}

}
