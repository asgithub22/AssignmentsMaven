package ConditionalStatementsAndLoops;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {

		// Step 1: Store transactions in a List

		List<Integer> transactions = new ArrayList<Integer>();

		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);

		// Initialize the counters
		int creditCount = 0, debitCount = 0;
		int totalCredit = 0, totalDebit = 0;
		int suspiciousCount = 0;

		// Loop through each transaction
		for (int amount : transactions) {
			// Check credit or debit transactions
			if (amount > 0) {
				creditCount++;
				totalCredit += amount;
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: ₹" + amount);
					suspiciousCount++;
				}
			} else if (amount < 0) {
				debitCount++;
				totalDebit += amount; 
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: ₹" + amount);
					suspiciousCount++;
				}
			}
		}

		// Remaining Bank Balance
		int finalBalance = totalCredit + totalDebit; 
		
		// Output results are given below :
		
		System.out.println("\nTotal Credit Transactions: " + creditCount);
		System.out.println("Total Debit Transactions: " + debitCount);
		System.out.println("Total Amount Credited: ₹" + totalCredit);
		System.out.println("Total Amount Debited: ₹" + (-totalDebit)); // make positive for display
		System.out.println("Final Bank Balance: ₹" + finalBalance);
		System.out.println("Total Suspicious Transactions: " + suspiciousCount);

	}

}
