package ConditionalStatementsAndLoops;

public class Assignments10 {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };

		// We'll manually find top 3 max values using linear scan
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max3 = max2;
				max2 = num;
			} else if (num > max3 && num != max2 && num != max1) {
				max3 = num;
			}

		}
		System.out.println("Second Largest: " + max2);
		System.out.println("Third Largest: " + max3);
	}
}
