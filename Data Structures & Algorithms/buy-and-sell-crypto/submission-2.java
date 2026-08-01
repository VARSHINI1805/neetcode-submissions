class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        for(int i = 0; i < prices.length ; i++){
            int p = 0;
            for(int j = i+1; j < prices.length ; j++){
                p = prices[j] - prices[i];
                min = Math.max(min,p);
            }
        }
        return min;
    }
}
