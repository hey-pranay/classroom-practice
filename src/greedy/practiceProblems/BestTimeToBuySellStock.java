package greedy.practiceProblems;

public class BestTimeToBuySellStock {
    static int maxProfit(int[] prices) {
        // lowest stock price seen so far
        int minPrice = prices[0];

        // best profit found so far
        int maxProfit = 0;

        // start from day 1
        for (int i = 1; i < prices.length; i++) {
            //if today's price is lower,
            // update the  min buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // calculate profit if we sell today
                int profit = prices[i] - minPrice;

                // update max profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {6, 4, 3};
        int[] prices2 = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}