package defaultFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class defaultFunctionalInterfacesClassSupplierMethod {

	public static void main(String[] args) {

		// Supplier to provide a new empty list
		Supplier<List<String>> listSupplier = () -> new ArrayList<>();

		// Get a new list from the supplier
		List<String> names = listSupplier.get();

		// Add elements to the list
		names.add("Aniket");
		names.add("Rahul");
		names.add("Priya");

		// Print the list
		System.out.println("Name List: " + names); // Print Names

		// Supplier to print random number
		Supplier<Integer> randomNumber = () -> new Random().nextInt(100); // Generate Random number from 0 to 99
		System.out.println("Random Number: " + randomNumber.get()); // Print Random Number
	}

}
