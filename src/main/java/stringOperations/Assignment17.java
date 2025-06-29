package stringOperations;

public class Assignment17 {

	public static void main(String[] args) {
		int rows = 5;
		System.out.println("Triangle with 5 Rows : \n");
		for (int i = 1; i <= rows; i++) { // Handle rows

			for (int space = 1; space <= rows - i; space++) { // Print blank spaces
				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) { // Print stars
				System.out.print("*");
			}

			System.out.println(); // Line change and carriage return
		}

	}
}
