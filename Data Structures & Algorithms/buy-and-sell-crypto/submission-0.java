class Solution {
    public int maxProfit(int[] prices) {
        int ma=0,m=prices[0];
        for(int i=0;i<prices.length;i++){
             m = Math.min(m,prices[i]);
            ma = Math.max(ma , prices[i]-m);
        }
        return ma;
    }
}
