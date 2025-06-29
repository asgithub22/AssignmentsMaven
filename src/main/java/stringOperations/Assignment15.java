package stringOperations;

public class Assignment15 {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		// Task 1: Count total number of words
		String[] words = sentence.split(" "); //Split the sentence from the space and store in the variable
		int wordCount = words.length; //count the length of the words and store in the variable
		System.out.println("Count the total number of words in the sentence : " + wordCount); //Print total number of words

		
		// Task 2: Print the sentence words in reverse order
		System.out.print("Print the sentence words in reverse order : ");
		for (int i = words.length - 1; i >= 0; i--) { //start the loop from total length of words minus 1 and end till of the words
			System.out.print(words[i]); //Print ith position of word
			if (i != 0) //check i is not equal to 0 
				System.out.print(" "); //then print space
		}
		System.out.println(); //exit from the for loop and print new line

		
		// Task 3: Convert the first character of each word to upper case and print original sentence
		StringBuilder capitalizedSentence = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				capitalizedSentence.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}
		System.out.println("Convert the first character of each word to uppercase and print original sentence : " + capitalizedSentence.toString().trim());
	}

}
