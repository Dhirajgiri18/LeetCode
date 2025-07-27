class Solution {
    public int maxProfit(int[] prices) {
        int curProfit = 0;
        int maxProfit = 0;
        int l =0, r = 1;
        while(r<prices.length){
            if(prices[l] < prices[r]){
                curProfit = prices[r] - prices[l];
                maxProfit = Math.max(curProfit, maxProfit);
            }else{
                l = r;
            }
            r++;
            
        }
        return maxProfit;
    }
}