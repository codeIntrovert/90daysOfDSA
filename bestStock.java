public class bestStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 0, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);

        }
        return profit;
    }

}
