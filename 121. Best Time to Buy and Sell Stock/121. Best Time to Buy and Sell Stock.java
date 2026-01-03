class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++) {
            if(prices[i] > bestBuy) {
                int currProfit = prices[i] - bestBuy;
                maxProfit = Math.max(currProfit, maxProfit);
            } else {
                bestBuy = prices[i];
            }
        }

        return maxProfit;
    }
}
