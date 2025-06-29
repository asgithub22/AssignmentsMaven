package ConditionalStatementsAndLoops;

public class Assignment12 {

	public static void main(String[] args) {
		
		int[] prices = { 7, 1, 5, 3, 6, 4 }; // Change input array here as needed
		
		//int[] prices = {7,6,4,3,1};
		
		int minPrice = prices[0]; //Initialize by first value of Array i.e 7
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				int profit = prices[i] - minPrice;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}

		System.out.println("Maximum Profit: " + maxProfit);
	}

}
