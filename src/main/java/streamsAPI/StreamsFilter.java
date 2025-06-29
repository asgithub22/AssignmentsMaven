package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {

	public static void main(String[] args) {

		List<String> names = List.of("John", "Jane", "Jack", "jill", "Bob"); //Store the name in the list
		List<String> letter = List.of("a", "e", "b", "c", "o", "z", "w", "x", "i", "y", "r", "q", "t", "u", "p"); //Store the alphabates in the list

		List<String> filteredNames = names.stream().map(x -> x.toUpperCase()).filter(name -> name.startsWith("J")).collect(Collectors.toList()); //All names convert in Upper case and after that extract those names whoes start with J
				
		System.out.println("Filtered Names: " + filteredNames); //Print the result

		List<String> vowels = letter.stream().filter(ch -> "aeiou".contains(ch.toLowerCase())).sorted().collect(Collectors.toList()); //Match the letter with vowel (aeiou) and convert in lower case and sort in ascending order 
				
		System.out.println("Vowels: " + vowels); // Print the result

	}

}
