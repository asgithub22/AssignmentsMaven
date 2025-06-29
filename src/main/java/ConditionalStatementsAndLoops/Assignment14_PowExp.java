package ConditionalStatementsAndLoops;

public class Assignment14_PowExp {

	public static void main(String[] args) {
		double x = 2; // Base Value
		double result = 1.0; // Initialize the value by 1
		int n = -2; // Power (Exponent) Value
		int i;

		int positiveExponent = n; // Initialize by power value

		if (n < 0) { // Check negative power value
			positiveExponent = -n; // If power value is negative then Initialize by negative power value
		}

		for (i = 1; i <= positiveExponent; i++) { // Calculate the base and power value
			result = result * x;
		}

		if (n < 0) { // Check if power(exponent) is negative
			result = 1.0 / result;
		}

		System.out.println("Input: x = " + x + ", n = " + n + " \n\nOutput : " + result); // Display the output after
																							// calculation of Base and
																							// Exponent

	}

}
