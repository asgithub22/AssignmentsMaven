package defaultFunctionalInterfaces;

import java.util.function.Predicate;

public class defaultFunctionalInterfacesClassPredicateMethod {

	public static void main(String[] args) {

		String input = "madam"; // you can change this to test other strings

		// Predicate to check Palindrome
		Predicate<String> isPalindrome = str -> { //Use braces due to multiple code
			int len = str.length(); //Extract the length of string and store in variable
			for (int i = 0; i < len / 2; i++) { //Initialize from 0 to half of the length of string
				if (str.charAt(i) != str.charAt(len - i - 1)) { //Check the ith position character one by one
					return false; //If not match then return False
				}
			}
			return true; //Otherwise True
		}; //Exit from the Lambda Expression

		System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome.test(input)); //Print the result

		// Predicate to check Prime number
		Predicate<Integer> isPrime = n -> { //Use braces due to multiple code
			if (n <= 1) //Check the value upto 1
				return false; //If condition satisfied then return False
			for (int i = 2; i <= n / 2; i++) { //Initialize the loop from 2 to half of the input number
				if (n % i == 0) //Check and compare the remainder with 0
					return false; //If condition will satisfied then return False and exit from the loop
			}
			return true; //Otherwise return True
		}; //Exit from the Lambda Expression

		int number = 9; // you can change this to test other values
		System.out.println("Is " + number + " a prime number? " + isPrime.test(number));//Print the result
	}
}
