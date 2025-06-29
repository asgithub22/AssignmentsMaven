package defaultFunctionalInterfaces;

import java.util.function.Consumer;

public class defaultFunctionalInterfacesClassConsumerMethod {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		String inputString = "Akash";
		String inputLower = inputString.toLowerCase();

		// Consumer to capitalize the first character of every words
		Consumer<String> cn = input -> {
			String[] words = input.split(" "); // Split the sentence from the space and store in the variable
			String uppercaseSentence = ""; // Variable to store the sentence with each word capitalized

			for (String word : words) {
				// Capitalize first character + keep rest of the word as is, then add a space
				uppercaseSentence += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
			}

			System.out.println("Uppercase Sentence is: " + uppercaseSentence.trim()); // Print the result
		};

		cn.accept(sentence); // call to Consumer

		// Consumer to remove duplicate characters
		Consumer<String> removeDuplicates = str -> {
			String result = "";

			for (int i = 0; i < str.length(); i++) { // loop start from ith position to till length of string
				char ch = str.charAt(i); // extract the character one by one and store in variable

				// Check if character is already in result
				if (!result.contains(String.valueOf(ch))) {
					result += ch;
				}
			}

			System.out.println("Original: " + str); // print original string
			System.out.println("Without duplicates: " + result); // print duplicate removed string
		};

		removeDuplicates.accept(inputLower); // Call the consumer with lower case input

	}
}